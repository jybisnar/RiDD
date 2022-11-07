package b4a.RiDD;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.RiDD", "b4a.RiDD.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.RiDD", "b4a.RiDD.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.RiDD.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _fadetimer = null;
public b4a.RiDD.mainpage _mainpage1 = null;
public b4a.RiDD.riddmain _riddmain1 = null;
public b4a.RiDD.manageusers _manageusers1 = null;
public b4a.RiDD.adduser _adduser1 = null;
public b4a.RiDD.riddqr _riddqr1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public static int _intfadecount1 = 0;
public anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 39;BA.debugLine="If FirstTime=True Then";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"Layout1\")";
mostCurrent._activity.LoadLayout("Layout1",mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="obj1.Target = ImageView1.Background";
mostCurrent._obj1.Target = (Object)(mostCurrent._imageview1.getBackground());
 //BA.debugLineNum = 45;BA.debugLine="obj1.RunMethod2(\"setAlpha\", 0, \"java.lang.int\")";
mostCurrent._obj1.RunMethod2("setAlpha",BA.NumberToString(0),"java.lang.int");
 //BA.debugLineNum = 46;BA.debugLine="ImageView1.SetLayout(0,0,100%x,100%y)";
mostCurrent._imageview1.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 47;BA.debugLine="ImageView1.Visible=True";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 48;BA.debugLine="FadeTimer.Initialize(\"TimerSplash1\", 50)";
_fadetimer.Initialize(processBA,"TimerSplash1",(long) (50));
 //BA.debugLineNum = 49;BA.debugLine="FadeTimer.Enabled = True";
_fadetimer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 50;BA.debugLine="intFadeCount1 = 0";
_intfadecount1 = (int) (0);
 //BA.debugLineNum = 51;BA.debugLine="mainPage1.SetLayout(0,0,100%x,100%y)        '1";
mostCurrent._mainpage1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 52;BA.debugLine="mainPage1.Visible=False";
mostCurrent._mainpage1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 53;BA.debugLine="RiDDMain1.SetLayout(0,0,100%x,100%y)        '1";
mostCurrent._riddmain1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 54;BA.debugLine="RiDDMain1.Visible=False";
mostCurrent._riddmain1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 55;BA.debugLine="ManageUsers1.SetLayout(0,0,100%x,100%y)        '";
mostCurrent._manageusers1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 56;BA.debugLine="ManageUsers1.Visible=False";
mostCurrent._manageusers1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 57;BA.debugLine="riddQR1.SetLayout(0,0,100%x,100%y)        '1";
mostCurrent._riddqr1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 58;BA.debugLine="riddQR1.Visible=False";
mostCurrent._riddqr1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 59;BA.debugLine="AddUser1.SetLayout(0,0,100%x,100%y)        '1";
mostCurrent._adduser1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 60;BA.debugLine="AddUser1.Visible=False";
mostCurrent._adduser1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 84;BA.debugLine="If UserClosed=True Then";
if (_userclosed==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 85;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 74;BA.debugLine="Starter.mainPage1=mainPage1";
mostCurrent._starter._mainpage1 /*Object*/  = (Object)(mostCurrent._mainpage1);
 //BA.debugLineNum = 75;BA.debugLine="Starter.RiDDMain1=RiDDMain1";
mostCurrent._starter._riddmain1 /*Object*/  = (Object)(mostCurrent._riddmain1);
 //BA.debugLineNum = 76;BA.debugLine="Starter.ManageUsers1=ManageUsers1";
mostCurrent._starter._manageusers1 /*Object*/  = (Object)(mostCurrent._manageusers1);
 //BA.debugLineNum = 77;BA.debugLine="Starter.AddUser1=AddUser1";
mostCurrent._starter._adduser1 /*Object*/  = (Object)(mostCurrent._adduser1);
 //BA.debugLineNum = 78;BA.debugLine="Starter.ImageView1=ImageView1";
mostCurrent._starter._imageview1 /*Object*/  = (Object)(mostCurrent._imageview1.getObject());
 //BA.debugLineNum = 79;BA.debugLine="Starter.riddQR1=riddQR1";
mostCurrent._starter._riddqr1 /*Object*/  = (Object)(mostCurrent._riddqr1);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _done_click() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub done_click()";
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private mainPage1 As mainPage";
mostCurrent._mainpage1 = new b4a.RiDD.mainpage();
 //BA.debugLineNum = 28;BA.debugLine="Private RiDDMain1 As RiDDMain";
mostCurrent._riddmain1 = new b4a.RiDD.riddmain();
 //BA.debugLineNum = 29;BA.debugLine="Private ManageUsers1 As ManageUsers";
mostCurrent._manageusers1 = new b4a.RiDD.manageusers();
 //BA.debugLineNum = 30;BA.debugLine="Private AddUser1 As AddUser";
mostCurrent._adduser1 = new b4a.RiDD.adduser();
 //BA.debugLineNum = 31;BA.debugLine="Private riddQR1 As riddQR";
mostCurrent._riddqr1 = new b4a.RiDD.riddqr();
 //BA.debugLineNum = 32;BA.debugLine="Dim ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim intFadeCount1 As Int";
_intfadecount1 = 0;
 //BA.debugLineNum = 34;BA.debugLine="Dim obj1 As Reflector";
mostCurrent._obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
main._process_globals();
starter._process_globals();
vb6._process_globals();
charts._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim FadeTimer As Timer";
_fadetimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _refresh_click() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub refresh_click()";
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _timersplash_end() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub TimerSplash_End";
 //BA.debugLineNum = 97;BA.debugLine="FadeTimer.Enabled = False";
_fadetimer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 98;BA.debugLine="ImageView1.Visible = False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 99;BA.debugLine="mainPage1.SetLayout(0,0,100%x,100%y)        '1";
mostCurrent._mainpage1._setlayout /*String*/ ((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 100;BA.debugLine="mainPage1.Visible=True";
mostCurrent._mainpage1._setvisible /*boolean*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 105;BA.debugLine="Starter.wsh.Querry(\"select fname, lname, age, sta";
mostCurrent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select fname, lname, age, status, idd from riddUserA","QUERRYManageUsers");
 //BA.debugLineNum = 111;BA.debugLine="Starter.wsh.Querry(\"select fname, lname from ridd";
mostCurrent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select fname, lname from riddUserA where lname !=''","QUERRYMain");
 //BA.debugLineNum = 117;BA.debugLine="Starter.wsh.Querry(\"select idd from riddUserA\",\"Q";
mostCurrent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select idd from riddUserA","QUERRYLatestIdd");
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _timersplash1_tick() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub TimerSplash1_Tick";
 //BA.debugLineNum = 90;BA.debugLine="intFadeCount1 = intFadeCount1 + 3";
_intfadecount1 = (int) (_intfadecount1+3);
 //BA.debugLineNum = 91;BA.debugLine="obj1.RunMethod2(\"setAlpha\", Min(intFadeCount1, 25";
mostCurrent._obj1.RunMethod2("setAlpha",BA.NumberToString(anywheresoftware.b4a.keywords.Common.Min(_intfadecount1,255)),"java.lang.int");
 //BA.debugLineNum = 93;BA.debugLine="If intFadeCount1 > 300 Then TimerSplash_End";
if (_intfadecount1>300) { 
_timersplash_end();};
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
}

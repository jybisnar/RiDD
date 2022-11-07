package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.RiDD", "b4a.RiDD.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.RiDD.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static b4a.RiDD.wtaserver _wsh = null;
public static String _dbsql = "";
public static Object _imageview1 = null;
public static Object _riddmain1 = null;
public static Object _manageusers1 = null;
public static Object _adduser1 = null;
public static Object _riddqr1 = null;
public static Object _mainpage1 = null;
public static String _uuid = "";
public static String _filepath = "";
public static boolean _waiting = false;
public static b4a.RiDD.clsparser _querrytable = null;
public static b4a.RiDD.clsparser _querrymain = null;
public static b4a.RiDD.clsparser _querrymanageusers = null;
public static b4a.RiDD.clsparser _querrylatestidd = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 238;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim Serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 25;BA.debugLine="Dim wsh As WTAServer";
_wsh = new b4a.RiDD.wtaserver();
 //BA.debugLineNum = 31;BA.debugLine="Dim dbsql As String=\"aquafeeder2.sqlite3\"";
_dbsql = "aquafeeder2.sqlite3";
 //BA.debugLineNum = 32;BA.debugLine="Dim ImageView1 As Object";
_imageview1 = new Object();
 //BA.debugLineNum = 33;BA.debugLine="Dim RiDDMain1 As Object";
_riddmain1 = new Object();
 //BA.debugLineNum = 34;BA.debugLine="Dim ManageUsers1 As Object";
_manageusers1 = new Object();
 //BA.debugLineNum = 35;BA.debugLine="Dim AddUser1 As Object";
_adduser1 = new Object();
 //BA.debugLineNum = 36;BA.debugLine="Dim riddQR1 As Object";
_riddqr1 = new Object();
 //BA.debugLineNum = 37;BA.debugLine="Dim mainPage1 As Object";
_mainpage1 = new Object();
 //BA.debugLineNum = 39;BA.debugLine="Dim uuid As String";
_uuid = "";
 //BA.debugLineNum = 40;BA.debugLine="Dim FilePath As String";
_filepath = "";
 //BA.debugLineNum = 41;BA.debugLine="Dim waiting As Boolean=False";
_waiting = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 42;BA.debugLine="Dim QUERRYTABLE As clsParser";
_querrytable = new b4a.RiDD.clsparser();
 //BA.debugLineNum = 43;BA.debugLine="Dim QUERRYMain As clsParser";
_querrymain = new b4a.RiDD.clsparser();
 //BA.debugLineNum = 44;BA.debugLine="Dim QUERRYManageUsers As clsParser";
_querrymanageusers = new b4a.RiDD.clsparser();
 //BA.debugLineNum = 45;BA.debugLine="Dim QUERRYLatestIdd As clsParser";
_querrylatestidd = new b4a.RiDD.clsparser();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _sendwsh(String _strs) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub sendwsh(strs As String)";
 //BA.debugLineNum = 72;BA.debugLine="wsh.SendClient(strs & \",\" &uuid & \"#\")";
_wsh._sendclient /*String*/ (_strs+","+_uuid+"#");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 52;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 53;BA.debugLine="r.Target=r.RunStaticMethod(\"java.util.UUID\", \"ran";
_r.Target = _r.RunStaticMethod("java.util.UUID","randomUUID",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 54;BA.debugLine="uuid =r.RunMethod(\"toString\")";
_uuid = BA.ObjectToString(_r.RunMethod("toString"));
 //BA.debugLineNum = 55;BA.debugLine="Serial1.Initialize(\"Serial1\")";
_serial1.Initialize("Serial1");
 //BA.debugLineNum = 56;BA.debugLine="wsh.Initialize(Me,\"wsh\",\"powergenAPP\",\"powergenDE";
_wsh._initialize /*String*/ (processBA,starter.getObject(),"wsh","powergenAPP","powergenDEV",_dbsql);
 //BA.debugLineNum = 57;BA.debugLine="wsh.InitWTAServer()";
_wsh._initwtaserver /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="QUERRYTABLE.Initialize(\"QUERRYTABLE\",Chr(13),1)";
_querrytable._initialize /*String*/ (processBA,"QUERRYTABLE",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 59;BA.debugLine="QUERRYMain.Initialize(\"QUERRYMain\",Chr(13),1)";
_querrymain._initialize /*String*/ (processBA,"QUERRYMain",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="QUERRYManageUsers.Initialize(\"QUERRYManageUsers\",";
_querrymanageusers._initialize /*String*/ (processBA,"QUERRYManageUsers",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 61;BA.debugLine="QUERRYLatestIdd.Initialize(\"QUERRYLatestIdd\",Chr(";
_querrylatestidd._initialize /*String*/ (processBA,"QUERRYLatestIdd",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 242;BA.debugLine="ToastMessageShow(\"exit\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("exit"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_newdata(String _data) throws Exception{
int _aa = 0;
String _z = "";
b4a.RiDD.manageusers _s = null;
String _strsa = "";
b4a.RiDD.riddmain _a = null;
String _strs = "";
String _strsb = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub wsh_NewData(data As String)";
 //BA.debugLineNum = 76;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 77;BA.debugLine="For aa = 0 To data.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (_data.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit2 ;_aa = _aa + step2 ) {
 //BA.debugLineNum = 78;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 79;BA.debugLine="z=data.SubString2(aa,aa+1)";
_z = _data.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 80;BA.debugLine="Dim s As ManageUsers = ManageUsers1";
_s = (b4a.RiDD.manageusers)(_manageusers1);
 //BA.debugLineNum = 86;BA.debugLine="If QUERRYMain.available(z)=True Then";
if (_querrymain._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 87;BA.debugLine="Dim strsa As String=QUERRYMain.data";
_strsa = _querrymain._data /*String*/ ;
 //BA.debugLineNum = 89;BA.debugLine="Dim a As RiDDMain = RiDDMain1";
_a = (b4a.RiDD.riddmain)(_riddmain1);
 //BA.debugLineNum = 90;BA.debugLine="wsh.DataGrid(a.QFrame6,strsa,\"First Name, Last";
_wsh._datagrid /*String*/ (_a._qframe6 /*b4a.RiDD.table*/ ,_strsa,"First Name, Last Name");
 //BA.debugLineNum = 91;BA.debugLine="waiting=False";
_waiting = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 93;BA.debugLine="If QUERRYManageUsers.available(z)=True Then";
if (_querrymanageusers._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 94;BA.debugLine="Dim strs As String=QUERRYManageUsers.data";
_strs = _querrymanageusers._data /*String*/ ;
 //BA.debugLineNum = 97;BA.debugLine="wsh.DataGrid(s.dtgUser,strs,\"First Name, Last N";
_wsh._datagrid /*String*/ (_s._dtguser /*b4a.RiDD.table*/ ,_strs,"First Name, Last Name, Age, Status, IDD Detected");
 //BA.debugLineNum = 99;BA.debugLine="waiting=False";
_waiting = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 101;BA.debugLine="If QUERRYLatestIdd.available(z)=True Then";
if (_querrylatestidd._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 102;BA.debugLine="Dim strsb As String=QUERRYLatestIdd.data";
_strsb = _querrylatestidd._data /*String*/ ;
 //BA.debugLineNum = 105;BA.debugLine="wsh.DataGrid(s.dtgIdd,strsb,\"IDD Detected\")";
_wsh._datagrid /*String*/ (_s._dtgidd /*b4a.RiDD.table*/ ,_strsb,"IDD Detected");
 //BA.debugLineNum = 106;BA.debugLine="waiting=False";
_waiting = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
}

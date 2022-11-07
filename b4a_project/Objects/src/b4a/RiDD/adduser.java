package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class adduser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.adduser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.adduser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadduser = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rbtnyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rbtnn = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtage = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 26;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 27;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 28;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnadduser_click() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub btnAddUser_click()";
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.RiDD.manageusers _xx = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 85;BA.debugLine="Dim xx As ManageUsers = Starter.ManageUsers1";
_xx = (b4a.RiDD.manageusers)(_starter._manageusers1 /*Object*/ );
 //BA.debugLineNum = 86;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 87;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 14;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim btnBack As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnAddUser As Button";
_btnadduser = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim rbtnYes As RadioButton";
_rbtnyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim rbtnN As RadioButton";
_rbtnn = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim txtName As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim txtAge As EditText";
_txtage = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 44;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 45;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 111;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 101;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 47;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 48;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 49;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 50;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 51;BA.debugLine="mBase.AddView(img,0.00 * mBase.Width,0.00 * mBase";
_mbase.AddView((android.view.View)(_img.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 52;BA.debugLine="img.Bitmap = LoadBitmapResize(File.DirAssets,\"joe";
_img.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"joey3.png",_img.getWidth(),_img.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 53;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 54;BA.debugLine="btnBack.Text = \"Back\"";
_btnback.setText(BA.ObjectToCharSequence("Back"));
 //BA.debugLineNum = 55;BA.debugLine="btnBack.Color = 0xff000000";
_btnback.setColor((int) (0xff000000));
 //BA.debugLineNum = 56;BA.debugLine="mBase.AddView(btnAddUser,0.07 * mBase.Width,0.50";
_mbase.AddView((android.view.View)(_btnadduser.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.50*_mbase.getHeight()),(int) (0.87*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 57;BA.debugLine="btnAddUser.TextSize = 21";
_btnadduser.setTextSize((float) (21));
 //BA.debugLineNum = 58;BA.debugLine="btnAddUser.Text = \"Add User\"";
_btnadduser.setText(BA.ObjectToCharSequence("Add User"));
 //BA.debugLineNum = 59;BA.debugLine="btnAddUser.Color = 0xff000000";
_btnadduser.setColor((int) (0xff000000));
 //BA.debugLineNum = 60;BA.debugLine="mBase.AddView(rbtnYes,0.27 * mBase.Width,0.39 * m";
_mbase.AddView((android.view.View)(_rbtnyes.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.39*_mbase.getHeight()),(int) (0.24*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 61;BA.debugLine="rbtnYes.Text=\"Yes\"";
_rbtnyes.setText(BA.ObjectToCharSequence("Yes"));
 //BA.debugLineNum = 62;BA.debugLine="mBase.AddView(rbtnN,0.60 * mBase.Width,0.39 * mBa";
_mbase.AddView((android.view.View)(_rbtnn.getObject()),(int) (0.60*_mbase.getWidth()),(int) (0.39*_mbase.getHeight()),(int) (0.24*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 63;BA.debugLine="rbtnN.Text=\"No\"";
_rbtnn.setText(BA.ObjectToCharSequence("No"));
 //BA.debugLineNum = 64;BA.debugLine="mBase.AddView(txtName,0.07 * mBase.Width,0.17 * m";
_mbase.AddView((android.view.View)(_txtname.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()),(int) (0.87*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 65;BA.debugLine="txtName.TextColor=Colors.black";
_txtname.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 66;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 67;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
_cd.Initialize(__c.Colors.Transparent,(int) (0));
 //BA.debugLineNum = 68;BA.debugLine="txtName.Background = cd";
_txtname.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 69;BA.debugLine="txtName.Gravity = Gravity.CENTER";
_txtname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 70;BA.debugLine="txtName.InputType = txtName.INPUT_TYPE_TEXT";
_txtname.setInputType(_txtname.INPUT_TYPE_TEXT);
 //BA.debugLineNum = 71;BA.debugLine="mBase.AddView(txtAge,0.07 * mBase.Width,0.27 * mB";
_mbase.AddView((android.view.View)(_txtage.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.27*_mbase.getHeight()),(int) (0.87*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 72;BA.debugLine="txtAge.TextColor=Colors.black";
_txtage.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 73;BA.debugLine="txtAge.Gravity = Gravity.CENTER";
_txtage.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 74;BA.debugLine="txtAge.Background = cd";
_txtage.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 75;BA.debugLine="txtAge.InputType = txtAge.INPUT_TYPE_NUMBERS";
_txtage.setInputType(_txtage.INPUT_TYPE_NUMBERS);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 34;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 35;BA.debugLine="btnAddUser.Initialize(\"btnAddUser\")";
_btnadduser.Initialize(ba,"btnAddUser");
 //BA.debugLineNum = 36;BA.debugLine="rbtnYes.Initialize(\"rbtnYes\")";
_rbtnyes.Initialize(ba,"rbtnYes");
 //BA.debugLineNum = 37;BA.debugLine="rbtnN.Initialize(\"rbtnN\")";
_rbtnn.Initialize(ba,"rbtnN");
 //BA.debugLineNum = 38;BA.debugLine="txtName.Initialize(\"txtName\")";
_txtname.Initialize(ba,"txtName");
 //BA.debugLineNum = 39;BA.debugLine="txtAge.Initialize(\"txtAge\")";
_txtage.Initialize(ba,"txtAge");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _main_click() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Main_click()";
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _rbtnno_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub rbtnNo_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _rbtnyes_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub rbtnYes_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 107;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 104;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _txtage_click() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub txtAge_click()";
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _txtname_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub txtName_click()";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

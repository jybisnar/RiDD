package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class riddqr extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.riddqr");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.riddqr.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblqrnum = null;
public anywheresoftware.b4a.objects.LabelWrapper _qrc = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 24;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 25;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 26;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.RiDD.manageusers _xx = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 72;BA.debugLine="Dim xx As ManageUsers = Starter.ManageUsers1";
_xx = (b4a.RiDD.manageusers)(_starter._manageusers1 /*Object*/ );
 //BA.debugLineNum = 73;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 74;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim lblQRNum As Label";
_lblqrnum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim qrc As Label";
_qrc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 41;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 42;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 92;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 82;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 45;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 46;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 47;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 48;BA.debugLine="mBase.AddView(img,0.00 * mBase.Width,0.00 * mBase";
_mbase.AddView((android.view.View)(_img.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 49;BA.debugLine="img.Bitmap = LoadBitmapResize(File.DirAssets,\"joe";
_img.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"joey4.png",_img.getWidth(),_img.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 50;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 51;BA.debugLine="btnBack.Text = \"Back\"";
_btnback.setText(BA.ObjectToCharSequence("Back"));
 //BA.debugLineNum = 52;BA.debugLine="btnBack.Color = 0xff000000";
_btnback.setColor((int) (0xff000000));
 //BA.debugLineNum = 53;BA.debugLine="lblQRNum.Color =  0x00ffffff";
_lblqrnum.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 54;BA.debugLine="lblQRNum.TextColor = 0xff000000";
_lblqrnum.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 55;BA.debugLine="lblQRNum.Gravity = Gravity.Left";
_lblqrnum.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 56;BA.debugLine="lblQRNum.Text = \"\"";
_lblqrnum.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 57;BA.debugLine="mBase.AddView(lblQRNum,0.05 * mBase.Width,0.81 *";
_mbase.AddView((android.view.View)(_lblqrnum.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.81*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 58;BA.debugLine="qrc.Color =  0x00ffffff";
_qrc.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 59;BA.debugLine="qrc.TextColor = 0xff000000";
_qrc.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 60;BA.debugLine="qrc.Gravity = Gravity.Left";
_qrc.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 61;BA.debugLine="qrc.Text = \"\"";
_qrc.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 62;BA.debugLine="mBase.AddView(qrc,0.05 * mBase.Width,0.12 * mBase";
_mbase.AddView((android.view.View)(_qrc.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.67*_mbase.getHeight()));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 32;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 34;BA.debugLine="lblQRNum.Initialize(\"lblQRNum\")";
_lblqrnum.Initialize(ba,"lblQRNum");
 //BA.debugLineNum = 35;BA.debugLine="qrc.Initialize(\"qrc\")";
_qrc.Initialize(ba,"qrc");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _lblqrnum_click() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub lblQRNum_click()";
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _main_click() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Main_click()";
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _qrc_click() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub qrc_click()";
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 88;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 85;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

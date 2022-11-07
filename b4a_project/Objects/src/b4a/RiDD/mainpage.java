package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.mainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.mainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainpagea = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblqrnum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qpushbutton6 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _qr = null;
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _img = null;
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
 //BA.debugLineNum = 14;BA.debugLine="Dim MainPageA As ImageView";
_mainpagea = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim lblQRNum As Label";
_lblqrnum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim QPushButton6 As Button";
_qpushbutton6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim QR As ToggleButton";
_qr = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim img As BitmapDrawable";
_img = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
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
 //BA.debugLineNum = 104;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 105;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 95;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 48;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 49;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 50;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 51;BA.debugLine="mBase.AddView(MainPageA,0.00 * mBase.Width,0.00 *";
_mbase.AddView((android.view.View)(_mainpagea.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 52;BA.debugLine="MainPageA.Bitmap = LoadBitmapResize(File.DirAsset";
_mainpagea.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"joey4.png",_mainpagea.getWidth(),_mainpagea.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 53;BA.debugLine="lblQRNum.Color =  0x00ffffff";
_lblqrnum.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 54;BA.debugLine="lblQRNum.TextColor = 0xff000000";
_lblqrnum.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 55;BA.debugLine="lblQRNum.Gravity = Gravity.Left";
_lblqrnum.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 56;BA.debugLine="lblQRNum.Text = \"\"";
_lblqrnum.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 57;BA.debugLine="mBase.AddView(lblQRNum,0.05 * mBase.Width,0.74 *";
_mbase.AddView((android.view.View)(_lblqrnum.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.74*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 58;BA.debugLine="mBase.AddView(QPushButton6,0.05 * mBase.Width,0.8";
_mbase.AddView((android.view.View)(_qpushbutton6.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.87*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 59;BA.debugLine="QPushButton6.Text = \"RiDD Controls\"";
_qpushbutton6.setText(BA.ObjectToCharSequence("RiDD Controls"));
 //BA.debugLineNum = 60;BA.debugLine="QPushButton6.TextColor= Colors.Black'Colors.RGB(5";
_qpushbutton6.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 61;BA.debugLine="QPushButton6.Color = Colors.RGB(153,255,204)";
_qpushbutton6.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 62;BA.debugLine="mBase.AddView(QR,0.05 * mBase.Width,0.12 * mBase.";
_mbase.AddView((android.view.View)(_qr.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.67*_mbase.getHeight()));
 //BA.debugLineNum = 63;BA.debugLine="QR.Color =  0x00ffffff";
_qr.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 64;BA.debugLine="QR.TextColor = 0xff000000";
_qr.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 65;BA.debugLine="QR.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CE";
_qr.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 66;BA.debugLine="QR.TextOff = \" \"";
_qr.setTextOff(BA.ObjectToCharSequence(" "));
 //BA.debugLineNum = 67;BA.debugLine="QR.TextOn = \" \"";
_qr.setTextOn(BA.ObjectToCharSequence(" "));
 //BA.debugLineNum = 68;BA.debugLine="QR.Background = img";
_qr.setBackground((android.graphics.drawable.Drawable)(_img.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="MainPageA.Initialize(\"MainPage\")";
_mainpagea.Initialize(ba,"MainPage");
 //BA.debugLineNum = 34;BA.debugLine="QR.Initialize(\"QR\")";
_qr.Initialize(ba,"QR");
 //BA.debugLineNum = 35;BA.debugLine="lblQRNum.Initialize(\"lblQRNum\")";
_lblqrnum.Initialize(ba,"lblQRNum");
 //BA.debugLineNum = 36;BA.debugLine="QPushButton6.Initialize(\"QPushButton6\")";
_qpushbutton6.Initialize(ba,"QPushButton6");
 //BA.debugLineNum = 37;BA.debugLine="img.Initialize(LoadBitmap(File.DirAssets, \"RiDDOF";
_img.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"RiDDOFF.png").getObject()));
 //BA.debugLineNum = 38;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _lblqrnum_click() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub lblQRNum_click()";
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _mainpage_click() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub MainPage_click()";
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _qpushbutton6_click() throws Exception{
b4a.RiDD.riddmain _xx = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub QPushButton6_click()";
 //BA.debugLineNum = 89;BA.debugLine="Dim xx As RiDDMain = Starter.RiDDMain1";
_xx = (b4a.RiDD.riddmain)(_starter._riddmain1 /*Object*/ );
 //BA.debugLineNum = 90;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 91;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _qr_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub QR_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 78;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 79;BA.debugLine="img.Initialize(LoadBitmap(File.DirAssets, \"RiDDO";
_img.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"RiDDON.png").getObject()));
 }else {
 //BA.debugLineNum = 81;BA.debugLine="img.Initialize(LoadBitmap(File.DirAssets, \"RiDDO";
_img.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"RiDDOFF.png").getObject()));
 };
 //BA.debugLineNum = 83;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 84;BA.debugLine="QR.Background = img";
_qr.setBackground((android.graphics.drawable.Drawable)(_img.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 101;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 98;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

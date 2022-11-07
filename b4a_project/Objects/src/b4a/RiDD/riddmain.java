package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class riddmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.riddmain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.riddmain.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmanageuser = null;
public anywheresoftware.b4a.objects.PanelWrapper _qframe4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _qframe5 = null;
public b4a.RiDD.table _qframe6 = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogout = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 27;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 28;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 29;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _btnlogout_click() throws Exception{
b4a.RiDD.mainpage _xx = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub btnLogout_click()";
 //BA.debugLineNum = 89;BA.debugLine="Dim xx As mainPage = Starter.mainPage1";
_xx = (b4a.RiDD.mainpage)(_starter._mainpage1 /*Object*/ );
 //BA.debugLineNum = 90;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 91;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _btnmanageuser_click() throws Exception{
b4a.RiDD.manageusers _xx = null;
 //BA.debugLineNum = 83;BA.debugLine="Sub btnManageUser_click()";
 //BA.debugLineNum = 84;BA.debugLine="Dim xx As ManageUsers = Starter.ManageUsers1";
_xx = (b4a.RiDD.manageusers)(_starter._manageusers1 /*Object*/ );
 //BA.debugLineNum = 85;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 86;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnManageUser As Button";
_btnmanageuser = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim QFrame4 As Panel";
_qframe4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim QFrame5 As Panel";
_qframe5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim QFrame6 As Table";
_qframe6 = new b4a.RiDD.table();
 //BA.debugLineNum = 20;BA.debugLine="Dim TabHost1 As TabHost";
_tabhost1 = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim btnLogout As Button";
_btnlogout = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _createbarstab() throws Exception{
b4a.RiDD.charts._bardata _bd = null;
b4a.RiDD.charts._graph _g = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub CreateBarsTab";
 //BA.debugLineNum = 108;BA.debugLine="Dim BD As BarData";
_bd = new b4a.RiDD.charts._bardata();
 //BA.debugLineNum = 109;BA.debugLine="BD.Initialize";
_bd.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="BD.Target = QFrame5";
_bd.Target /*anywheresoftware.b4a.objects.PanelWrapper*/  = _qframe5;
 //BA.debugLineNum = 111;BA.debugLine="BD.BarsWidth = 15dip";
_bd.BarsWidth /*int*/  = __c.DipToCurrent((int) (15));
 //BA.debugLineNum = 112;BA.debugLine="BD.Stacked = False";
_bd.Stacked /*boolean*/  = __c.False;
 //BA.debugLineNum = 113;BA.debugLine="Charts.AddBarColor(BD, MakeTransparent(Colors.Gre";
_charts._addbarcolor /*String*/ (ba,_bd,_maketransparent(__c.Colors.Green,(int) (230)));
 //BA.debugLineNum = 114;BA.debugLine="Charts.AddBarColor(BD, MakeTransparent(Colors.Mag";
_charts._addbarcolor /*String*/ (ba,_bd,_maketransparent(__c.Colors.Magenta,(int) (230)));
 //BA.debugLineNum = 115;BA.debugLine="Charts.AddBarColor(BD, MakeTransparent(Colors.Yel";
_charts._addbarcolor /*String*/ (ba,_bd,_maketransparent(__c.Colors.Yellow,(int) (230)));
 //BA.debugLineNum = 119;BA.debugLine="Charts.AddBarPoint(BD, 1, Array As Float(54, 10,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(1),new float[]{(float) (54),(float) (10),(float) (15)});
 //BA.debugLineNum = 120;BA.debugLine="Charts.AddBarPoint(BD, 2, Array As Float(60, 11,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(2),new float[]{(float) (60),(float) (11),(float) (17)});
 //BA.debugLineNum = 121;BA.debugLine="Charts.AddBarPoint(BD, 3, Array As Float(62, 20,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(3),new float[]{(float) (62),(float) (20),(float) (17)});
 //BA.debugLineNum = 122;BA.debugLine="Charts.AddBarPoint(BD, 4, Array As Float(58, 14,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(4),new float[]{(float) (58),(float) (14),(float) (23)});
 //BA.debugLineNum = 123;BA.debugLine="Charts.AddBarPoint(BD, 5, Array As Float(72, 30,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(5),new float[]{(float) (72),(float) (30),(float) (43)});
 //BA.debugLineNum = 124;BA.debugLine="Charts.AddBarPoint(BD, 6, Array As Float(84, 53,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(6),new float[]{(float) (84),(float) (53),(float) (62)});
 //BA.debugLineNum = 125;BA.debugLine="Charts.AddBarPoint(BD, 7, Array As Float(86, 59,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(7),new float[]{(float) (86),(float) (59),(float) (68)});
 //BA.debugLineNum = 126;BA.debugLine="Charts.AddBarPoint(BD, 8, Array As Float(99, 66,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(8),new float[]{(float) (99),(float) (66),(float) (67)});
 //BA.debugLineNum = 127;BA.debugLine="Charts.AddBarPoint(BD, 9, Array As Float(97, 75,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(9),new float[]{(float) (97),(float) (75),(float) (89)});
 //BA.debugLineNum = 128;BA.debugLine="Charts.AddBarPoint(BD, 10, Array As Float(99, 88,";
_charts._addbarpoint /*String*/ (ba,_bd,BA.NumberToString(10),new float[]{(float) (99),(float) (88),(float) (92)});
 //BA.debugLineNum = 129;BA.debugLine="Dim G As Graph";
_g = new b4a.RiDD.charts._graph();
 //BA.debugLineNum = 130;BA.debugLine="G.Initialize";
_g.Initialize();
 //BA.debugLineNum = 131;BA.debugLine="G.Title = \"RiDD Data Percentages\"";
_g.Title /*String*/  = "RiDD Data Percentages";
 //BA.debugLineNum = 132;BA.debugLine="G.XAxis = \"Number of Usage\"";
_g.XAxis /*String*/  = "Number of Usage";
 //BA.debugLineNum = 133;BA.debugLine="G.YAxis = \"Values\"";
_g.YAxis /*String*/  = "Values";
 //BA.debugLineNum = 134;BA.debugLine="G.YStart = 0";
_g.YStart /*float*/  = (float) (0);
 //BA.debugLineNum = 135;BA.debugLine="G.YEnd = 100";
_g.YEnd /*float*/  = (float) (100);
 //BA.debugLineNum = 136;BA.debugLine="G.YInterval = 10";
_g.YInterval /*float*/  = (float) (10);
 //BA.debugLineNum = 137;BA.debugLine="G.AxisColor = Colors.Black";
_g.AxisColor /*int*/  = __c.Colors.Black;
 //BA.debugLineNum = 138;BA.debugLine="Charts.DrawBarsChart(G, BD, Colors.White)";
_charts._drawbarschart /*String*/ (ba,_g,_bd,__c.Colors.White);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _createpietab() throws Exception{
b4a.RiDD.charts._piedata _pd = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _legend = null;
anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub CreatePieTab";
 //BA.debugLineNum = 149;BA.debugLine="Dim PD As PieData";
_pd = new b4a.RiDD.charts._piedata();
 //BA.debugLineNum = 150;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="PD.Target = QFrame4 'Set the target view";
_pd.Target /*anywheresoftware.b4a.objects.PanelWrapper*/  = _qframe4;
 //BA.debugLineNum = 153;BA.debugLine="Charts.AddPieItem(PD, \"Healthy\", 4, Colors.Green)";
_charts._addpieitem /*String*/ (ba,_pd,"Healthy",(float) (4),__c.Colors.Green);
 //BA.debugLineNum = 154;BA.debugLine="Charts.AddPieItem(PD, \"Colloid Goiter\", 1, Colors";
_charts._addpieitem /*String*/ (ba,_pd,"Colloid Goiter",(float) (1),__c.Colors.Magenta);
 //BA.debugLineNum = 155;BA.debugLine="Charts.AddPieItem(PD, \"Diffused Goiter\", 1, Color";
_charts._addpieitem /*String*/ (ba,_pd,"Diffused Goiter",(float) (1),__c.Colors.Yellow);
 //BA.debugLineNum = 158;BA.debugLine="PD.GapDegrees = 0 'Total size of gaps between sli";
_pd.GapDegrees /*int*/  = (int) (0);
 //BA.debugLineNum = 159;BA.debugLine="PD.LegendBackColor = Colors.ARGB(150, 100, 100, 1";
_pd.LegendBackColor /*int*/  = __c.Colors.ARGB((int) (150),(int) (100),(int) (100),(int) (100));
 //BA.debugLineNum = 160;BA.debugLine="Dim legend As Bitmap";
_legend = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 165;BA.debugLine="legend = Charts.DrawPie(PD, Colors.Transparent, T";
_legend = _charts._drawpie /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (ba,_pd,__c.Colors.Transparent,__c.True);
 //BA.debugLineNum = 166;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 167;BA.debugLine="ImageView1.Initialize(\"\")";
_imageview1.Initialize(ba,"");
 //BA.debugLineNum = 168;BA.debugLine="ImageView1.SetBackgroundImage(legend)";
_imageview1.SetBackgroundImageNew((android.graphics.Bitmap)(_legend.getObject()));
 //BA.debugLineNum = 169;BA.debugLine="QFrame4.AddView(ImageView1, 10dip, 10dip, legend.";
_qframe4.AddView((android.view.View)(_imageview1.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),_legend.getWidth(),_legend.getHeight());
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 47;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 48;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 183;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 173;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 51;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 52;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 53;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 54;BA.debugLine="mBase.AddView(img,0.00 * mBase.Width,0.00 * mBase";
_mbase.AddView((android.view.View)(_img.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 55;BA.debugLine="img.Bitmap = LoadBitmapResize(File.DirAssets,\"joe";
_img.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"joey1.png",_img.getWidth(),_img.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 56;BA.debugLine="mBase.AddView(btnManageUser,0.62 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_btnmanageuser.getObject()),(int) (0.62*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.30*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 57;BA.debugLine="btnManageUser.Text = \"Manage Users\"";
_btnmanageuser.setText(BA.ObjectToCharSequence("Manage Users"));
 //BA.debugLineNum = 58;BA.debugLine="btnManageUser.Color = Colors.RGB(153,255,204)";
_btnmanageuser.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 59;BA.debugLine="btnManageUser.TextColor = Colors.Black";
_btnmanageuser.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 62;BA.debugLine="btnLogout.Text = \"Log Out\"";
_btnlogout.setText(BA.ObjectToCharSequence("Log Out"));
 //BA.debugLineNum = 63;BA.debugLine="btnLogout.Color = Colors.RGB(153,255,204)";
_btnlogout.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 64;BA.debugLine="btnLogout.TextColor = Colors.Black";
_btnlogout.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 65;BA.debugLine="mBase.AddView(btnLogout,0.73 * mBase.Width,0.89 *";
_mbase.AddView((android.view.View)(_btnlogout.getObject()),(int) (0.73*_mbase.getWidth()),(int) (0.89*_mbase.getHeight()),(int) (0.30*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 66;BA.debugLine="mBase.AddView(QFrame4,0.07 * mBase.Width,0.15 * m";
_mbase.AddView((android.view.View)(_qframe4.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()));
 //BA.debugLineNum = 67;BA.debugLine="QFrame4.Color =  0x00ffffff";
_qframe4.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 68;BA.debugLine="CreatePieTab";
_createpietab();
 //BA.debugLineNum = 69;BA.debugLine="mBase.AddView(QFrame5,0.07 * mBase.Width,0.39 * m";
_mbase.AddView((android.view.View)(_qframe5.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.39*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.231*_mbase.getHeight()));
 //BA.debugLineNum = 70;BA.debugLine="QFrame5.Color =  0x00ffffff";
_qframe5.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 71;BA.debugLine="CreateBarsTab";
_createbarstab();
 //BA.debugLineNum = 72;BA.debugLine="QFrame6.AddToParent(mBase, 0.07 * mBase.Width,0.6";
_qframe6._addtoparent /*String*/ ((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_mbase.getObject())),(int) (0.07*_mbase.getWidth()),(int) (0.69*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.30*_mbase.getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _img_click() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub img_click()";
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 34;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 35;BA.debugLine="btnManageUser.Initialize(\"btnManageUser\")";
_btnmanageuser.Initialize(ba,"btnManageUser");
 //BA.debugLineNum = 36;BA.debugLine="QFrame4.Initialize(\"QFrame4\")";
_qframe4.Initialize(ba,"QFrame4");
 //BA.debugLineNum = 37;BA.debugLine="QFrame5.Initialize(\"QFrame5\")";
_qframe5.Initialize(ba,"QFrame5");
 //BA.debugLineNum = 38;BA.debugLine="QFrame6.Initialize(Me,\"QFrame6\",4)";
_qframe6._initialize /*String*/ (ba,this,"QFrame6",(int) (4));
 //BA.debugLineNum = 39;BA.debugLine="TabHost1.Initialize(\"TabHost1\")";
_tabhost1.Initialize(ba,"TabHost1");
 //BA.debugLineNum = 40;BA.debugLine="btnLogout.Initialize(\"btnLogout\")";
_btnlogout.Initialize(ba,"btnLogout");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public int  _maketransparent(int _color,int _alpha) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub MakeTransparent(Color As Int, Alpha As Int) As";
 //BA.debugLineNum = 141;BA.debugLine="Return Bit.And(Color, Bit.Or(0x00FFFFFF, Bit.Shif";
if (true) return __c.Bit.And(_color,__c.Bit.Or((int) (0x00ffffff),__c.Bit.ShiftLeft(_alpha,(int) (24))));
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return 0;
}
public String  _qframe4_click() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub QFrame4_click()";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _qframe5_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub QFrame5_click()";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _qframe6_click() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub QFrame6_click()";
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 179;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 176;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

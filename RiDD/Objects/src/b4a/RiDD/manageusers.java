package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class manageusers extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.manageusers");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.manageusers.class).invoke(this, new Object[] {null});
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
public b4a.RiDD.table _dtguser = null;
public anywheresoftware.b4a.objects.LabelWrapper _summaryreportlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _summaryreport = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluserdatan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluserdatal = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluserdataa = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluserdatas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluserdatai = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _genqr = null;
public b4a.RiDD.table _dtgidd = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _detailsdialog = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogyesno = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialoglastname = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogfirstname = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _detailsqr = null;
public b4a.RiDD.qrgenerator _qrcode = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imgvqr = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblqrnum = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmpqr = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _logo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 51;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 52;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 53;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public void  _btnadduser_click() throws Exception{
ResumableSub_btnAddUser_click rsub = new ResumableSub_btnAddUser_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAddUser_click extends BA.ResumableSub {
public ResumableSub_btnAddUser_click(b4a.RiDD.manageusers parent) {
this.parent = parent;
}
b4a.RiDD.manageusers parent;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _x = 0;
int _res = 0;
String _sql = "";
int step14;
int limit14;
int step18;
int limit18;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 175;BA.debugLine="lblUserDataN.Text = \"\"";
parent._lbluserdatan.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 176;BA.debugLine="lblUserDataL.Text = \"\"";
parent._lbluserdatal.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 177;BA.debugLine="lblUserDataA.Text = \"\"";
parent._lbluserdataa.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 178;BA.debugLine="lblUserDataS.Text = \"\"";
parent._lbluserdatas.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 179;BA.debugLine="lblUserDataI.Text = \"\"";
parent._lbluserdatai.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 180;BA.debugLine="summaryReport.Text = \"\"";
parent._summaryreport.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 181;BA.debugLine="Dim sf As Object = DetailsDialog.ShowAsync(\"Enrol";
_sf = parent._detailsdialog.ShowAsync("Enroll a User:","Ok","Cancel","",ba,(android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"form.png").getObject()),parent.__c.True);
 //BA.debugLineNum = 182;BA.debugLine="DetailsDialog.SetSize(100%x, 500dip)";
parent._detailsdialog.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 183;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, this, _sf);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 184;BA.debugLine="pnl.LoadLayout(\"DetailsDialog\")";
_pnl.LoadLayout("DetailsDialog",ba);
 //BA.debugLineNum = 186;BA.debugLine="DialogFirstName.EditText.InputType = Bit.Or(0x000";
parent._dialogfirstname.getEditText().setInputType(parent.__c.Bit.Or((int) (0x00002000),parent._dialogfirstname.getEditText().getInputType()));
 //BA.debugLineNum = 187;BA.debugLine="DialogLastName.EditText.InputType = Bit.Or(0x0000";
parent._dialoglastname.getEditText().setInputType(parent.__c.Bit.Or((int) (0x00002000),parent._dialoglastname.getEditText().getInputType()));
 //BA.debugLineNum = 188;BA.debugLine="DialogAge.Add(\"\")";
parent._dialogage.Add("");
 //BA.debugLineNum = 189;BA.debugLine="For i = 1 To 100";
if (true) break;

case 1:
//for
this.state = 4;
step14 = 1;
limit14 = (int) (100);
_i = (int) (1) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 4;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 3;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 3:
//C
this.state = 19;
 //BA.debugLineNum = 190;BA.debugLine="DialogAge.Add(i)";
parent._dialogage.Add(BA.NumberToString(_i));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 192;BA.debugLine="DialogYesNO.Add(\"\")";
parent._dialogyesno.Add("");
 //BA.debugLineNum = 193;BA.debugLine="For x = 1 To 1";
if (true) break;

case 5:
//for
this.state = 8;
step18 = 1;
limit18 = (int) (1);
_x = (int) (1) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 8;
if ((step18 > 0 && _x <= limit18) || (step18 < 0 && _x >= limit18)) this.state = 7;
if (true) break;

case 21:
//C
this.state = 20;
_x = ((int)(0 + _x + step18)) ;
if (true) break;

case 7:
//C
this.state = 21;
 //BA.debugLineNum = 194;BA.debugLine="DialogYesNO.Add(\"lactating\")";
parent._dialogyesno.Add("lactating");
 //BA.debugLineNum = 195;BA.debugLine="DialogYesNO.Add(\"non lactating\")";
parent._dialogyesno.Add("non lactating");
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 197;BA.debugLine="DetailsDialog.GetButton(DialogResponse.POSITIVE).";
parent._detailsdialog.GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent.__c.False);
 //BA.debugLineNum = 198;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, this, _sf);
this.state = 22;
return;
case 22:
//C
this.state = 9;
_res = (Integer) result[0];
;
 //BA.debugLineNum = 200;BA.debugLine="DialogFirstName.EditText.Enabled = False";
parent._dialogfirstname.getEditText().setEnabled(parent.__c.False);
 //BA.debugLineNum = 201;BA.debugLine="DialogLastName.EditText.Enabled = False";
parent._dialoglastname.getEditText().setEnabled(parent.__c.False);
 //BA.debugLineNum = 202;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 205;BA.debugLine="Dim sql As String";
_sql = "";
 //BA.debugLineNum = 206;BA.debugLine="sql=$\"insert into riddUserA(fname,lname,age,stat";
_sql = ("insert into riddUserA(fname,lname,age,status) values ('"+parent.__c.SmartStringFormatter("",(Object)(parent._dialogfirstname.getText()))+"','"+parent.__c.SmartStringFormatter("",(Object)(parent._dialoglastname.getText()))+"','"+parent.__c.SmartStringFormatter("",(Object)(parent._dialogage.getSelectedItem()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(parent._dialogyesno.getSelectedItem()))+"')");
 //BA.debugLineNum = 207;BA.debugLine="Starter.wsh.Querry(sql,\"\")";
parent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ (_sql,"");
 //BA.debugLineNum = 208;BA.debugLine="Starter.waiting=True";
parent._starter._waiting /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 209;BA.debugLine="Starter.wsh.Querry(\"select fname,lname,age,statu";
parent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select fname,lname,age,status,idd from riddUserA","QUERRYManageUsers");
 //BA.debugLineNum = 211;BA.debugLine="Starter.wsh.Querry(\"select fname,lname from ridd";
parent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select fname,lname from riddUserA","QUERRYMain");
 //BA.debugLineNum = 212;BA.debugLine="Starter.wsh.Querry(\"select idd from riddUserA\",\"";
parent._starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select idd from riddUserA","QUERRYLatestIdd");
 //BA.debugLineNum = 214;BA.debugLine="Do While Starter.waiting=True";
if (true) break;

case 12:
//do while
this.state = 15;
while (parent._starter._waiting /*boolean*/ ==parent.__c.True) {
this.state = 14;
if (true) break;
}
if (true) break;

case 14:
//C
this.state = 12;
 //BA.debugLineNum = 215;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 23;
return;
case 23:
//C
this.state = 12;
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 217;BA.debugLine="ToastMessageShow($\"${DialogFirstName.Text} ${Dia";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(parent._dialogfirstname.getText()))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._dialoglastname.getText()))+" is "+parent.__c.SmartStringFormatter("",(Object)(parent._dialogage.getSelectedItem()))+" years old and is a "+parent.__c.SmartStringFormatter("",(Object)(parent._dialogyesno.getSelectedItem()))+" person.")),parent.__c.True);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _dialog_ready(anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
}
public void  _dialog_result(int _res) throws Exception{
}
public String  _btnback_click() throws Exception{
b4a.RiDD.riddmain _xx = null;
 //BA.debugLineNum = 165;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 166;BA.debugLine="Dim xx As RiDDMain = Starter.RiDDMain1";
_xx = (b4a.RiDD.riddmain)(_starter._riddmain1 /*Object*/ );
 //BA.debugLineNum = 167;BA.debugLine="xx.Visible = True";
_xx._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 168;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _checkallfieldsvalid() throws Exception{
boolean _valid = false;
 //BA.debugLineNum = 237;BA.debugLine="Sub CheckAllFieldsValid";
 //BA.debugLineNum = 238;BA.debugLine="Dim valid As Boolean = DialogAge.SelectedIndex >";
_valid = _dialogage.getSelectedIndex()>0 && _dialogyesno.getSelectedIndex()>0 && _dialogfirstname.getText().length()>0 && _dialoglastname.getText().length()>0;
 //BA.debugLineNum = 239;BA.debugLine="DetailsDialog.GetButton(DialogResponse.POSITIVE).";
_detailsdialog.GetButton(__c.DialogResponse.POSITIVE).setEnabled(_valid);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnBack As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnAddUser As Button";
_btnadduser = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim dtgUser As Table";
_dtguser = new b4a.RiDD.table();
 //BA.debugLineNum = 19;BA.debugLine="Dim summaryReportLabel As Label";
_summaryreportlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim summaryReport As Label";
_summaryreport = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblUserDataN As Label";
_lbluserdatan = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblUserDataL As Label";
_lbluserdatal = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lblUserDataA As Label";
_lbluserdataa = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lblUserDataS As Label";
_lbluserdatas = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim lblUserDataI As Label";
_lbluserdatai = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim txtSearch As EditText";
_txtsearch = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim genQR As Button";
_genqr = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim dtgIdd As Table";
_dtgidd = new b4a.RiDD.table();
 //BA.debugLineNum = 32;BA.debugLine="Private DetailsDialog As CustomLayoutDialog";
_detailsdialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
 //BA.debugLineNum = 33;BA.debugLine="Private DialogAge As Spinner";
_dialogage = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private DialogYesNO As Spinner";
_dialogyesno = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private DialogLastName As FloatLabeledEditText";
_dialoglastname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private DialogFirstName As FloatLabeledEditText";
_dialogfirstname = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private DetailsQR As CustomLayoutDialog";
_detailsqr = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
 //BA.debugLineNum = 39;BA.debugLine="Private qrcode As QRGenerator";
_qrcode = new b4a.RiDD.qrgenerator();
 //BA.debugLineNum = 40;BA.debugLine="Private imgVQR As B4XView";
_imgvqr = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private lblQRNum As Label";
_lblqrnum = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private BmpQR, logo As B4XBitmap";
_bmpqr = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_logo = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 83;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 84;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _dialogage_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub DialogAge_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 222;BA.debugLine="CheckAllFieldsValid";
_checkallfieldsvalid();
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _dialogfirstname_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub DialogFirstName_TextChanged (Old As String, Ne";
 //BA.debugLineNum = 234;BA.debugLine="CheckAllFieldsValid";
_checkallfieldsvalid();
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _dialoglastname_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub DialogLastName_TextChanged (Old As String, New";
 //BA.debugLineNum = 230;BA.debugLine="CheckAllFieldsValid";
_checkallfieldsvalid();
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _dialogyesno_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub DialogYesNO_ItemClick (Position As Int, Value";
 //BA.debugLineNum = 226;BA.debugLine="CheckAllFieldsValid";
_checkallfieldsvalid();
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _dtguser_cellclick(int _col,int _row) throws Exception{
String _val = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub dtgUser_CellClick (Col As Int,Row As Int)";
 //BA.debugLineNum = 246;BA.debugLine="Log(\"CellClick: \" & Col & \" , \" & Row)";
__c.LogImpl("84063233","CellClick: "+BA.NumberToString(_col)+" , "+BA.NumberToString(_row),0);
 //BA.debugLineNum = 247;BA.debugLine="Dim val As String = dtgUser.GetValue(Col,Row)";
_val = _dtguser._getvalue /*String*/ (_col,_row);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public void  _genqr_click() throws Exception{
ResumableSub_genQR_click rsub = new ResumableSub_genQR_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_genQR_click extends BA.ResumableSub {
public ResumableSub_genQR_click(b4a.RiDD.manageusers parent) {
this.parent = parent;
}
b4a.RiDD.manageusers parent;
Object _qrgen = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.RiDD.riddqr _a = null;
String _b = "";
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 281;BA.debugLine="Dim qrgen As Object = DetailsQR.ShowAsync(\"Enroll";
_qrgen = parent._detailsqr.ShowAsync("Enroll a User:","OK","","",ba,(android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"form.png").getObject()),parent.__c.True);
 //BA.debugLineNum = 282;BA.debugLine="DetailsQR.SetSize(100%x, 500dip)";
parent._detailsqr.SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 283;BA.debugLine="Wait For (qrgen) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, this, _qrgen);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 284;BA.debugLine="pnl.LoadLayout(\"RiDDQr\")";
_pnl.LoadLayout("RiDDQr",ba);
 //BA.debugLineNum = 286;BA.debugLine="qrcode.Initialize(imgVQR.Width)";
parent._qrcode._initialize /*String*/ (ba,parent._imgvqr.getWidth());
 //BA.debugLineNum = 287;BA.debugLine="Dim a As riddQR = Starter.riddQR1";
_a = (b4a.RiDD.riddqr)(parent._starter._riddqr1 /*Object*/ );
 //BA.debugLineNum = 288;BA.debugLine="Dim b As String = a.lblQRNum.Text";
_b = _a._lblqrnum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
 //BA.debugLineNum = 297;BA.debugLine="BmpQR = qrcode.Create(lblQRNum.Text)";
parent._bmpqr = parent._qrcode._create /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (parent._lblqrnum.getText());
 //BA.debugLineNum = 298;BA.debugLine="logo = xui.LoadBitmapResize(File.DirAssets,\"RIDD";
parent._logo = parent._xui.LoadBitmapResize(parent.__c.File.getDirAssets(),"RIDD PAGING.jpg",(int) (parent._bmpqr.getWidth()),(int) (parent._bmpqr.getHeight()),parent.__c.True);
 //BA.debugLineNum = 299;BA.debugLine="lblQRNum.Text = b";
parent._lblqrnum.setText(BA.ObjectToCharSequence(_b));
 //BA.debugLineNum = 300;BA.debugLine="imgVQR.SetBitmap(qrcode.AddBitmap(BmpQR, logo, 25";
parent._imgvqr.SetBitmap((android.graphics.Bitmap)(parent._qrcode._addbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (parent._bmpqr,parent._logo,(int) (255*0/(double)100)).Resize(parent._imgvqr.getWidth(),parent._imgvqr.getHeight(),parent.__c.True).getObject()));
 //BA.debugLineNum = 301;BA.debugLine="DetailsQR.GetButton(DialogResponse.POSITIVE).Enab";
parent._detailsqr.GetButton(parent.__c.DialogResponse.POSITIVE).setEnabled(parent.__c.True);
 //BA.debugLineNum = 302;BA.debugLine="Wait For (qrgen) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, this, _qrgen);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_res = (Integer) result[0];
;
 //BA.debugLineNum = 304;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 305;BA.debugLine="ToastMessageShow($\"${lblQRNum.Text} is the QR co";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(parent._lblqrnum.getText()))+" is the QR code.")),parent.__c.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 320;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 310;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 87;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 88;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 89;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 90;BA.debugLine="mBase.AddView(img,0.00 * mBase.Width,0.00 * mBase";
_mbase.AddView((android.view.View)(_img.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="img.Bitmap = LoadBitmapResize(File.DirAssets,\"joe";
_img.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"joey2.png",_img.getWidth(),_img.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="btnBack.Text = \"Back\"";
_btnback.setText(BA.ObjectToCharSequence("Back"));
 //BA.debugLineNum = 94;BA.debugLine="btnBack.Color = Colors.RGB(153,255,204)";
_btnback.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 95;BA.debugLine="btnBack.TextColor = Colors.Black";
_btnback.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 96;BA.debugLine="mBase.AddView(btnAddUser,0.73 * mBase.Width,0.02";
_mbase.AddView((android.view.View)(_btnadduser.getObject()),(int) (0.73*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.23*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 97;BA.debugLine="btnAddUser.Text = \"Enroll a User\"";
_btnadduser.setText(BA.ObjectToCharSequence("Enroll a User"));
 //BA.debugLineNum = 98;BA.debugLine="btnAddUser.Color = Colors.RGB(153,255,204)";
_btnadduser.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 99;BA.debugLine="btnAddUser.TextColor = Colors.Black";
_btnadduser.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 100;BA.debugLine="dtgUser.AddToParent(mBase,0.05 * mBase.Width,0.18";
_dtguser._addtoparent /*String*/ ((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_mbase.getObject())),(int) (0.05*_mbase.getWidth()),(int) (0.18*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.3*_mbase.getHeight()));
 //BA.debugLineNum = 103;BA.debugLine="summaryReportLabel.Color =  Colors.DarkGray";
_summaryreportlabel.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 104;BA.debugLine="summaryReportLabel.Gravity = Gravity.Left";
_summaryreportlabel.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 105;BA.debugLine="summaryReportLabel.Text = \"Summary Report of a Ri";
_summaryreportlabel.setText(BA.ObjectToCharSequence("Summary Report of a RiDD Device User"));
 //BA.debugLineNum = 106;BA.debugLine="summaryReportLabel.TextSize = 21";
_summaryreportlabel.setTextSize((float) (21));
 //BA.debugLineNum = 107;BA.debugLine="summaryReportLabel.TextColor = Colors.White";
_summaryreportlabel.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 108;BA.debugLine="summaryReportLabel.Gravity = Gravity.CENTER_HORIZ";
_summaryreportlabel.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 109;BA.debugLine="mBase.AddView(summaryReportLabel,0.05 * mBase.Wid";
_mbase.AddView((android.view.View)(_summaryreportlabel.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.49*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 110;BA.debugLine="dtgIdd.AddToParent(mBase,0.05 * mBase.Width,0.64";
_dtgidd._addtoparent /*String*/ ((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_mbase.getObject())),(int) (0.05*_mbase.getWidth()),(int) (0.64*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.44*_mbase.getHeight()));
 //BA.debugLineNum = 111;BA.debugLine="lblUserDataN.Color =  0x00ffffff";
_lbluserdatan.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 112;BA.debugLine="lblUserDataN.TextColor = 0xff000000";
_lbluserdatan.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 113;BA.debugLine="lblUserDataN.Gravity = Gravity.Left";
_lbluserdatan.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 114;BA.debugLine="lblUserDataN.Text = \"\"";
_lbluserdatan.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(lblUserDataN,0.05 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_lbluserdatan.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.53*_mbase.getHeight()),(int) (0.6*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="lblUserDataL.Color =  0x00ffffff";
_lbluserdatal.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 117;BA.debugLine="lblUserDataL.TextColor = 0xff000000";
_lbluserdatal.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 118;BA.debugLine="lblUserDataL.Gravity = Gravity.Left";
_lbluserdatal.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 119;BA.debugLine="lblUserDataL.Text = \"\"";
_lbluserdatal.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 120;BA.debugLine="mBase.AddView(lblUserDataL,0.05 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_lbluserdatal.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.55*_mbase.getHeight()),(int) (0.6*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 121;BA.debugLine="lblUserDataA.Color =  0x00ffffff";
_lbluserdataa.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 122;BA.debugLine="lblUserDataA.TextColor = 0xff000000";
_lbluserdataa.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 123;BA.debugLine="lblUserDataA.Gravity = Gravity.Left";
_lbluserdataa.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 124;BA.debugLine="lblUserDataA.Text = \"\"";
_lbluserdataa.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 125;BA.debugLine="mBase.AddView(lblUserDataA,0.05 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_lbluserdataa.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.6*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 126;BA.debugLine="lblUserDataS.Color =  0x00ffffff";
_lbluserdatas.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 127;BA.debugLine="lblUserDataS.TextColor = 0xff000000";
_lbluserdatas.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 128;BA.debugLine="lblUserDataS.Gravity = Gravity.Left";
_lbluserdatas.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 129;BA.debugLine="lblUserDataS.Text = \"\"";
_lbluserdatas.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 130;BA.debugLine="mBase.AddView(lblUserDataS,0.05 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_lbluserdatas.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.59*_mbase.getHeight()),(int) (0.6*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 131;BA.debugLine="lblUserDataI.Color =  0x00ffffff";
_lbluserdatai.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 132;BA.debugLine="lblUserDataI.TextColor = 0xff000000";
_lbluserdatai.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 133;BA.debugLine="lblUserDataI.Gravity = Gravity.Left";
_lbluserdatai.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 134;BA.debugLine="lblUserDataI.Text = \"\"";
_lbluserdatai.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 135;BA.debugLine="mBase.AddView(lblUserDataI,0.05 * mBase.Width,0.6";
_mbase.AddView((android.view.View)(_lbluserdatai.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.61*_mbase.getHeight()),(int) (0.6*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 136;BA.debugLine="summaryReport.Color =  0x00ffffff";
_summaryreport.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 137;BA.debugLine="summaryReport.TextColor = 0xff000000";
_summaryreport.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 138;BA.debugLine="summaryReport.Gravity = Gravity.Left";
_summaryreport.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 139;BA.debugLine="summaryReport.Text = \"\"";
_summaryreport.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 140;BA.debugLine="summaryReport.TextSize = 15";
_summaryreport.setTextSize((float) (15));
 //BA.debugLineNum = 141;BA.debugLine="summaryReport.Text = summaryReport.Text.ToUpperCa";
_summaryreport.setText(BA.ObjectToCharSequence(_summaryreport.getText().toUpperCase()));
 //BA.debugLineNum = 142;BA.debugLine="mBase.AddView(summaryReport,0.4 * mBase.Width,0.5";
_mbase.AddView((android.view.View)(_summaryreport.getObject()),(int) (0.4*_mbase.getWidth()),(int) (0.53*_mbase.getHeight()),(int) (0.58*_mbase.getWidth()),(int) (0.3*_mbase.getHeight()));
 //BA.debugLineNum = 145;BA.debugLine="txtSearch.Color =  Colors.LightGray";
_txtsearch.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 146;BA.debugLine="txtSearch.TextColor = 0xff000000";
_txtsearch.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 147;BA.debugLine="txtSearch.Gravity = Gravity.CENTER_HORIZONTAL + G";
_txtsearch.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 148;BA.debugLine="txtSearch.Hint = \"Search User\"";
_txtsearch.setHint("Search User");
 //BA.debugLineNum = 149;BA.debugLine="mBase.AddView(txtSearch,0.05 * mBase.Width,0.11 *";
_mbase.AddView((android.view.View)(_txtsearch.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()),(int) (0.91*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 150;BA.debugLine="mBase.AddView(genQR,0.73 * mBase.Width,0.89 * mBa";
_mbase.AddView((android.view.View)(_genqr.getObject()),(int) (0.73*_mbase.getWidth()),(int) (0.89*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 151;BA.debugLine="genQR.Text = \"Generate QR\"";
_genqr.setText(BA.ObjectToCharSequence("Generate QR"));
 //BA.debugLineNum = 152;BA.debugLine="genQR.Color = Colors.RGB(153,255,204)";
_genqr.setColor(__c.Colors.RGB((int) (153),(int) (255),(int) (204)));
 //BA.debugLineNum = 153;BA.debugLine="genQR.TextColor = Colors.Black";
_genqr.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 55;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 56;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 57;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 58;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 59;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 60;BA.debugLine="btnAddUser.Initialize(\"btnAddUser\")";
_btnadduser.Initialize(ba,"btnAddUser");
 //BA.debugLineNum = 61;BA.debugLine="txtSearch.Initialize(\"txtSearch\")";
_txtsearch.Initialize(ba,"txtSearch");
 //BA.debugLineNum = 62;BA.debugLine="dtgUser.Initialize(Me,\"dtgUser\",4)";
_dtguser._initialize /*String*/ (ba,this,"dtgUser",(int) (4));
 //BA.debugLineNum = 65;BA.debugLine="summaryReportLabel.Initialize(\"summaryReportLabel";
_summaryreportlabel.Initialize(ba,"summaryReportLabel");
 //BA.debugLineNum = 66;BA.debugLine="summaryReport.Initialize(\"summaryReport\")";
_summaryreport.Initialize(ba,"summaryReport");
 //BA.debugLineNum = 67;BA.debugLine="lblUserDataN.Initialize(\"lblUserDataN\")";
_lbluserdatan.Initialize(ba,"lblUserDataN");
 //BA.debugLineNum = 68;BA.debugLine="lblUserDataL.Initialize(\"lblUserDataL\")";
_lbluserdatal.Initialize(ba,"lblUserDataL");
 //BA.debugLineNum = 69;BA.debugLine="lblUserDataA.Initialize(\"lblUserDataA\")";
_lbluserdataa.Initialize(ba,"lblUserDataA");
 //BA.debugLineNum = 70;BA.debugLine="lblUserDataS.Initialize(\"lblUserDataS\")";
_lbluserdatas.Initialize(ba,"lblUserDataS");
 //BA.debugLineNum = 71;BA.debugLine="lblUserDataI.Initialize(\"lblUserDataI\")";
_lbluserdatai.Initialize(ba,"lblUserDataI");
 //BA.debugLineNum = 72;BA.debugLine="genQR.Initialize(\"genQR\")";
_genqr.Initialize(ba,"genQR");
 //BA.debugLineNum = 74;BA.debugLine="dtgIdd.Initialize(Me,\"dtgIdd\",4)";
_dtgidd._initialize /*String*/ (ba,this,"dtgIdd",(int) (4));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _lbluserdataa_click() throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub lblUserDataA_click()";
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _lbluserdatai_click() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub lblUserDataI_click()";
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _lbluserdatal_click() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub lblUserDataL_click()";
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _lbluserdatan_click() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub lblUserDataN_click()";
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _lbluserdatas_click() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub lblUserDataS_click()";
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _main_click() throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub Main_click()";
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 316;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 313;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return "";
}
public String  _summ_click() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub summ_click()";
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public String  _summaryreport_click() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub summaryReport_click()";
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _summaryreportlabel_click() throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub summaryReportLabel_click()";
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _txtsearch_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub txtSearch_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 243;BA.debugLine="Starter.wsh.Querry(\"select fname,lname,age,status";
_starter._wsh /*b4a.RiDD.wtaserver*/ ._querry /*String*/ ("select fname,lname,age,status,idd from riddUserA where fname like '%"+_new+"%' or lname like '%"+_new+"%' or age like '%"+_new+"%' or status like '%"+_new+"%' or idd like '%"+_new+"%'","QUERRYManageUsers");
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clsparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.clsparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.clsparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _str = "";
public String _buffer = "";
public String _data = "";
public String _wait_header = "";
public String _terminate_char = "";
public int _num_terminate_char = 0;
public int _num_bufterminate_char = 0;
public boolean _status = false;
public int _currpointer = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public boolean  _available(String _mscomm_input) throws Exception{
String _c = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub available(MSComm_input As String) As Boolean";
 //BA.debugLineNum = 37;BA.debugLine="Dim c As String";
_c = "";
 //BA.debugLineNum = 38;BA.debugLine="str = str & MSComm_input";
_str = _str+_mscomm_input;
 //BA.debugLineNum = 39;BA.debugLine="Do While (str <> \"\")";
while (((_str).equals("") == false)) {
 //BA.debugLineNum = 40;BA.debugLine="c = vb6.Mid2(str, 1, 1)";
_c = _vb6._mid2 /*String*/ (getActivityBA(),_str,(int) (1),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="If status Then data = data & c";
if (_status) { 
_data = _data+_c;};
 //BA.debugLineNum = 43;BA.debugLine="If Pollbyte(c) Then";
if (_pollbyte(_c)) { 
 //BA.debugLineNum = 44;BA.debugLine="data = \"\"";
_data = "";
 //BA.debugLineNum = 45;BA.debugLine="status = True";
_status = __c.True;
 //BA.debugLineNum = 46;BA.debugLine="num_bufterminate_char = 0";
_num_bufterminate_char = (int) (0);
 };
 //BA.debugLineNum = 48;BA.debugLine="If (status = True) Then";
if ((_status==__c.True)) { 
 //BA.debugLineNum = 49;BA.debugLine="If (c = terminate_char) Then";
if (((_c).equals(_terminate_char))) { 
 //BA.debugLineNum = 50;BA.debugLine="str = vb6.Mid(str, 2)";
_str = _vb6._mid /*String*/ (getActivityBA(),_str,(int) (2));
 //BA.debugLineNum = 51;BA.debugLine="num_bufterminate_char = num_bufter";
_num_bufterminate_char = (int) (_num_bufterminate_char+1);
 //BA.debugLineNum = 52;BA.debugLine="If (num_bufterminate_char = num_te";
if ((_num_bufterminate_char==_num_terminate_char)) { 
 //BA.debugLineNum = 53;BA.debugLine="status = False";
_status = __c.False;
 //BA.debugLineNum = 54;BA.debugLine="data = vb6.Mid2(data, 1, vb6.L";
_data = _vb6._mid2 /*String*/ (getActivityBA(),_data,(int) (1),(int) ((double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),_data)))-1));
 //BA.debugLineNum = 55;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 };
 //BA.debugLineNum = 59;BA.debugLine="If vb6.Len(str) > 1 Then";
if ((double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),_str)))>1) { 
 //BA.debugLineNum = 60;BA.debugLine="str = vb6.Mid(str, 2)";
_str = _vb6._mid /*String*/ (getActivityBA(),_str,(int) (2));
 }else {
 //BA.debugLineNum = 62;BA.debugLine="str = \"\"";
_str = "";
 //BA.debugLineNum = 63;BA.debugLine="Exit";
if (true) break;
 };
 }
;
 //BA.debugLineNum = 66;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 4;BA.debugLine="Dim buffer As String";
_buffer = "";
 //BA.debugLineNum = 5;BA.debugLine="Dim data As String";
_data = "";
 //BA.debugLineNum = 7;BA.debugLine="Dim wait_header As String";
_wait_header = "";
 //BA.debugLineNum = 8;BA.debugLine="Dim terminate_char As String";
_terminate_char = "";
 //BA.debugLineNum = 9;BA.debugLine="Dim num_terminate_char As Int";
_num_terminate_char = 0;
 //BA.debugLineNum = 10;BA.debugLine="Dim num_bufterminate_char As Int";
_num_bufterminate_char = 0;
 //BA.debugLineNum = 11;BA.debugLine="Dim status As Boolean";
_status = false;
 //BA.debugLineNum = 12;BA.debugLine="Dim currPointer As Int";
_currpointer = 0;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _databuffer() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Databuffer() As String";
 //BA.debugLineNum = 70;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _waitheader,String _terminatechar,int _numterminate) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(WaitHeader As String, Termin";
 //BA.debugLineNum = 18;BA.debugLine="num_terminate_char = numTerminate";
_num_terminate_char = _numterminate;
 //BA.debugLineNum = 19;BA.debugLine="wait_header = WaitHeader";
_wait_header = _waitheader;
 //BA.debugLineNum = 20;BA.debugLine="terminate_char = TerminateChar";
_terminate_char = _terminatechar;
 //BA.debugLineNum = 21;BA.debugLine="currPointer = 1";
_currpointer = (int) (1);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public boolean  _pollbyte(String _x) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Pollbyte(x As String) As Boolean";
 //BA.debugLineNum = 25;BA.debugLine="If (vb6.Mid2(wait_header, currPointer, 1) = x)";
if (((_vb6._mid2 /*String*/ (getActivityBA(),_wait_header,_currpointer,(int) (1))).equals(_x))) { 
 //BA.debugLineNum = 26;BA.debugLine="currPointer = currPointer + 1";
_currpointer = (int) (_currpointer+1);
 }else {
 //BA.debugLineNum = 28;BA.debugLine="currPointer = 1";
_currpointer = (int) (1);
 };
 //BA.debugLineNum = 30;BA.debugLine="If ((currPointer - 1) = vb6.Len(wait_header))";
if (((_currpointer-1)==(double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),_wait_header))))) { 
 //BA.debugLineNum = 31;BA.debugLine="currPointer = 1";
_currpointer = (int) (1);
 //BA.debugLineNum = 32;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 34;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

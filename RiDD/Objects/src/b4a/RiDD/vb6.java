package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class vb6 {
private static vb6 mostCurrent = new vb6();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.charts _charts = null;
public static float  _constrain(anywheresoftware.b4a.BA _ba,float _amt,float _low,float _high) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub constrain(amt As Float,low As Float,high As Fl";
 //BA.debugLineNum = 16;BA.debugLine="If amt<low Then amt=low";
if (_amt<_low) { 
_amt = _low;};
 //BA.debugLineNum = 17;BA.debugLine="If amt>high Then amt=high";
if (_amt>_high) { 
_amt = _high;};
 //BA.debugLineNum = 18;BA.debugLine="Return amt";
if (true) return _amt;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return 0f;
}
public static String  _date(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Date() As String";
 //BA.debugLineNum = 66;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _getcsv(anywheresoftware.b4a.BA _ba,int _x,String _chars,String _str) throws Exception{
int _b = 0;
String _ret = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub getCSV(x As Int, Chars As String, str As Strin";
 //BA.debugLineNum = 99;BA.debugLine="Dim B As Int";
_b = 0;
 //BA.debugLineNum = 100;BA.debugLine="Dim ret As String";
_ret = "";
 //BA.debugLineNum = 101;BA.debugLine="B = 1";
_b = (int) (1);
 //BA.debugLineNum = 102;BA.debugLine="Do While (x <> 0)";
while ((_x!=0)) {
 //BA.debugLineNum = 103;BA.debugLine="If Mid2(str, B, 1) = Chars Then x = x - 1";
if ((_mid2(_ba,_str,_b,(int) (1))).equals(_chars)) { 
_x = (int) (_x-1);};
 //BA.debugLineNum = 105;BA.debugLine="B = B + 1";
_b = (int) (_b+1);
 }
;
 //BA.debugLineNum = 107;BA.debugLine="Do While ((Mid2(str, B, 1) <> Chars) And ((str";
while ((((_mid2(_ba,_str,_b,(int) (1))).equals(_chars) == false) && ((_str.length())+1)!=_b)) {
 //BA.debugLineNum = 108;BA.debugLine="ret = ret & Mid2(str, B, 1)";
_ret = _ret+_mid2(_ba,_str,_b,(int) (1));
 //BA.debugLineNum = 109;BA.debugLine="B = B + 1";
_b = (int) (_b+1);
 }
;
 //BA.debugLineNum = 111;BA.debugLine="Return ret";
if (true) return _ret;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public static String  _getfilestr(anywheresoftware.b4a.BA _ba,String _file_) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub GetFileStr(file_ As String) As String";
 //BA.debugLineNum = 40;BA.debugLine="Return File.GetText(Starter.FilePath,file_)";
if (true) return anywheresoftware.b4a.keywords.Common.File.GetText(mostCurrent._starter._filepath /*String*/ ,_file_);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static long  _instr(anywheresoftware.b4a.BA _ba,int _start,String _string1,String _string2) throws Exception{
long _x = 0L;
 //BA.debugLineNum = 29;BA.debugLine="Sub InStr(Start As Int,String1 As String,String2 A";
 //BA.debugLineNum = 30;BA.debugLine="Dim x As Long";
_x = 0L;
 //BA.debugLineNum = 31;BA.debugLine="x=String1.IndexOf(String2)";
_x = (long) (_string1.indexOf(_string2));
 //BA.debugLineNum = 32;BA.debugLine="Return x+1";
if (true) return (long) (_x+1);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return 0L;
}
public static String  _jsontostring(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _am) throws Exception{
String _str = "";
String _types = "";
int _i = 0;
 //BA.debugLineNum = 114;BA.debugLine="Sub jsonToString(am As Map) As String";
 //BA.debugLineNum = 115;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 116;BA.debugLine="Dim types As String";
_types = "";
 //BA.debugLineNum = 117;BA.debugLine="For i = 0 To am.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_am.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 118;BA.debugLine="If GetType(am.GetValueAt(i))=\"java.lang.String\"";
if ((anywheresoftware.b4a.keywords.Common.GetType(_am.GetValueAt(_i))).equals("java.lang.String")) { 
 //BA.debugLineNum = 119;BA.debugLine="types=\"'\"";
_types = "'";
 }else {
 //BA.debugLineNum = 121;BA.debugLine="types=\"\"";
_types = "";
 };
 //BA.debugLineNum = 123;BA.debugLine="str=str & \"'\" & am.GetKeyAt(i) &  \"'\" & \":\" &  t";
_str = _str+"'"+BA.ObjectToString(_am.GetKeyAt(_i))+"'"+":"+_types+BA.ObjectToString(_am.GetValueAt(_i))+_types;
 //BA.debugLineNum = 124;BA.debugLine="If (i+1)<> am.Size Then";
if ((_i+1)!=_am.getSize()) { 
 //BA.debugLineNum = 125;BA.debugLine="str=str&\",\"";
_str = _str+",";
 };
 //BA.debugLineNum = 127;BA.debugLine="Log(GetType(\"\")=\"java.lang.Integer\")";
anywheresoftware.b4a.keywords.Common.LogImpl("812124173",BA.ObjectToString((anywheresoftware.b4a.keywords.Common.GetType((Object)(""))).equals("java.lang.Integer")),0);
 //BA.debugLineNum = 128;BA.debugLine="Log(\"Key: \" & am.GetKeyAt(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("812124174","Key: "+BA.ObjectToString(_am.GetKeyAt(_i)),0);
 //BA.debugLineNum = 129;BA.debugLine="Log(\"Value: \" & am.GetValueAt(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("812124175","Value: "+BA.ObjectToString(_am.GetValueAt(_i)),0);
 }
};
 //BA.debugLineNum = 131;BA.debugLine="str=\"{\"&str&\"}\"";
_str = "{"+_str+"}";
 //BA.debugLineNum = 132;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _len(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Len(str As String) As String";
 //BA.debugLineNum = 72;BA.debugLine="Return str.Length";
if (true) return BA.NumberToString(_str.length());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static float  _maparduino(anywheresoftware.b4a.BA _ba,float _x,float _in_min,float _in_max,float _out_min,float _out_max) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub mapArduino(x As Float, in_min As Float,  in_ma";
 //BA.debugLineNum = 23;BA.debugLine="Return (x - in_min) * (out_max - out_min) / (in_";
if (true) return (float) ((_x-_in_min)*(_out_max-_out_min)/(double)(_in_max-_in_min)+_out_min);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return 0f;
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _string1,int _start) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Mid(String1 As String,Start As Int) As String";
 //BA.debugLineNum = 45;BA.debugLine="If(String1.Length>=Start)Then";
if ((_string1.length()>=_start)) { 
 //BA.debugLineNum = 46;BA.debugLine="Return String1.SubString(Start-1)";
if (true) return _string1.substring((int) (_start-1));
 }else {
 //BA.debugLineNum = 48;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _mid2(anywheresoftware.b4a.BA _ba,String _string1,int _start,int _lenght) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Mid2(String1 As String,Start As Int,Lenght As";
 //BA.debugLineNum = 52;BA.debugLine="If(String1.Length>=Start)Then";
if ((_string1.length()>=_start)) { 
 }else {
 //BA.debugLineNum = 54;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 56;BA.debugLine="If(String1.Length>=Start+Lenght-1)Then";
if ((_string1.length()>=_start+_lenght-1)) { 
 //BA.debugLineNum = 57;BA.debugLine="Return String1.SubString2(Start-1,Lenght+Start-1";
if (true) return _string1.substring((int) (_start-1),(int) (_lenght+_start-1));
 }else {
 //BA.debugLineNum = 59;BA.debugLine="Return String1.SubString(Start-1)";
if (true) return _string1.substring((int) (_start-1));
 };
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _now(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Now() As String";
 //BA.debugLineNum = 63;BA.debugLine="Return DateTime.Date(DateTime.Now) & \" \" & DateTi";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _savefilestr(anywheresoftware.b4a.BA _ba,String _file_,String _str) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SaveFileStr(file_ As String, str As String)";
 //BA.debugLineNum = 36;BA.debugLine="File.WriteString(Starter.FilePath,file_,str)";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._filepath /*String*/ ,_file_,_str);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _str,String _delimeter) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Split(str As String,delimeter As String) As St";
 //BA.debugLineNum = 11;BA.debugLine="Return Regex.Split(delimeter,str)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimeter,_str);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public static String  _time(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Time() As String";
 //BA.debugLineNum = 69;BA.debugLine="Return DateTime.Time(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static boolean  _timeinbetween(anywheresoftware.b4a.BA _ba,String _mintime,String _maxtime,String _timenow) throws Exception{
long _mintimelong = 0L;
long _maxtimelong = 0L;
long _currtimelong = 0L;
 //BA.debugLineNum = 75;BA.debugLine="Sub TimeInBetween(minTime As String, maxTime As St";
 //BA.debugLineNum = 76;BA.debugLine="Dim minTimeLong As Long";
_mintimelong = 0L;
 //BA.debugLineNum = 77;BA.debugLine="Dim maxTimeLong As Long";
_maxtimelong = 0L;
 //BA.debugLineNum = 78;BA.debugLine="Dim currTimeLong As Long";
_currtimelong = 0L;
 //BA.debugLineNum = 83;BA.debugLine="minTimeLong = DateTime.TimeParse(minTime)/1000";
_mintimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_mintime)/(double)1000);
 //BA.debugLineNum = 84;BA.debugLine="maxTimeLong = DateTime.TimeParse(maxTime)/1000";
_maxtimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_maxtime)/(double)1000);
 //BA.debugLineNum = 85;BA.debugLine="currTimeLong = DateTime.TimeParse(timenow)/100";
_currtimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_timenow)/(double)1000);
 //BA.debugLineNum = 86;BA.debugLine="If minTimeLong < maxTimeLong Then";
if (_mintimelong<_maxtimelong) { 
 //BA.debugLineNum = 87;BA.debugLine="If currTimeLong >= minTimeLong And currTim";
if (_currtimelong>=_mintimelong && _currtimelong<=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 }else {
 //BA.debugLineNum = 90;BA.debugLine="If currTimeLong > maxTimeLong Then";
if (_currtimelong>_maxtimelong) { 
 //BA.debugLineNum = 91;BA.debugLine="If currTimeLong >= minTimeLong And cur";
if (_currtimelong>=_mintimelong && _currtimelong>=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 }else {
 //BA.debugLineNum = 93;BA.debugLine="If currTimeLong <= minTimeLong And cur";
if (_currtimelong<=_mintimelong && _currtimelong<=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 };
 };
 //BA.debugLineNum = 96;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return false;
}
public static long  _ubound(anywheresoftware.b4a.BA _ba,String[] _str) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub UBound(str() As String) As Long";
 //BA.debugLineNum = 26;BA.debugLine="Return str.Length";
if (true) return (long) (_str.length);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return 0L;
}
}

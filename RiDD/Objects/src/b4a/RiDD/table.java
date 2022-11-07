package b4a.RiDD;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.RiDD.table");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.RiDD.table.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public Object _callback = null;
public String _event = "";
public int _selectedrow = 0;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.List _labelscache = null;
public int _minvisiblerow = 0;
public int _maxvisiblerow = 0;
public boolean _visible = false;
public anywheresoftware.b4a.objects.collections.Map _visiblerows = null;
public int _numberofcolumns = 0;
public int _columnwidth = 0;
public int _rowheight = 0;
public int _headercolor = 0;
public int _tablecolor = 0;
public int _fontcolor = 0;
public int _headerfontcolor = 0;
public float _fontsize = 0f;
public int _alignment = 0;
public Object[] _selecteddrawable = null;
public Object[] _drawable1 = null;
public Object[] _drawable2 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.RiDD.main _main = null;
public b4a.RiDD.starter _starter = null;
public b4a.RiDD.vb6 _vb6 = null;
public b4a.RiDD.charts _charts = null;
public static class _rowcol{
public boolean IsInitialized;
public int Row;
public int Col;
public void Initialize() {
IsInitialized = true;
Row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addrow(String[] _values) throws Exception{
int _lastrow = 0;
 //BA.debugLineNum = 146;BA.debugLine="Public Sub AddRow(Values() As String)";
 //BA.debugLineNum = 147;BA.debugLine="If Values.Length <> NumberOfColumns Then";
if (_values.length!=_numberofcolumns) { 
 //BA.debugLineNum = 148;BA.debugLine="Log(\"Wrong number of values.\")";
__c.LogImpl("810027010","Wrong number of values.",0);
 //BA.debugLineNum = 149;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 151;BA.debugLine="Data.Add(Values)";
_data.Add((Object)(_values));
 //BA.debugLineNum = 152;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
 //BA.debugLineNum = 153;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (_data.getSize()-1);
 //BA.debugLineNum = 154;BA.debugLine="If lastRow < (SV.ScrollPosition + SV.Height) / Ro";
if (_lastrow<(_sv.getScrollPosition()+_sv.getHeight())/(double)_rowheight+1) { 
 //BA.debugLineNum = 155;BA.debugLine="ShowRow(lastRow)";
_showrow(_lastrow);
 };
 //BA.debugLineNum = 157;BA.debugLine="SV.Panel.Height = Data.Size * RowHeight";
_sv.getPanel().setHeight((int) (_data.getSize()*_rowheight));
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub AddToParent(Act As Activity, Left As In";
 //BA.debugLineNum = 133;BA.debugLine="visible = True";
_visible = __c.True;
 //BA.debugLineNum = 134;BA.debugLine="Header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 135;BA.debugLine="Header.Color = TableColor";
_header.setColor(_tablecolor);
 //BA.debugLineNum = 136;BA.debugLine="Act.AddView(Header, Left, Top , Width, RowHeight)";
_act.AddView((android.view.View)(_header.getObject()),_left,_top,_width,_rowheight);
 //BA.debugLineNum = 137;BA.debugLine="Act.AddView(SV, Left, Top + RowHeight, Width, Hei";
_act.AddView((android.view.View)(_sv.getObject()),_left,(int) (_top+_rowheight),_width,(int) (_height-_rowheight));
 //BA.debugLineNum = 138;BA.debugLine="ColumnWidth = SV.Width / NumberOfColumns";
_columnwidth = (int) (_sv.getWidth()/(double)_numberofcolumns);
 //BA.debugLineNum = 140;BA.debugLine="SV_ScrollChanged(0)";
_sv_scrollchanged((int) (0));
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _cell_click() throws Exception{
b4a.RiDD.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 254;BA.debugLine="Private Sub Cell_Click";
 //BA.debugLineNum = 255;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.RiDD.table._rowcol();
 //BA.debugLineNum = 256;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 257;BA.debugLine="l = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 258;BA.debugLine="rc = l.Tag";
_rc = (b4a.RiDD.table._rowcol)(_l.getTag());
 //BA.debugLineNum = 259;BA.debugLine="SelectRow(rc.Row)";
_selectrow(_rc.Row /*int*/ );
 //BA.debugLineNum = 260;BA.debugLine="If SubExists(Callback, Event & \"_CellClick\") Then";
if (__c.SubExists(ba,_callback,_event+"_CellClick")) { 
 //BA.debugLineNum = 261;BA.debugLine="CallSub3(Callback, Event & \"_CellClick\", rc.Col,";
__c.CallSubNew3(ba,_callback,_event+"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 4;BA.debugLine="Private SV As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private Callback As Object";
_callback = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 8;BA.debugLine="Private SelectedRow As Int";
_selectedrow = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private visible As Boolean";
_visible = false;
 //BA.debugLineNum = 13;BA.debugLine="Private visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private NumberOfColumns, ColumnWidth As Int";
_numberofcolumns = 0;
_columnwidth = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public RowHeight, HeaderColor, TableColor, FontCo";
_rowheight = 0;
_headercolor = 0;
_tablecolor = 0;
_fontcolor = 0;
_headerfontcolor = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public FontSize As Float";
_fontsize = 0f;
 //BA.debugLineNum = 17;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
 //BA.debugLineNum = 18;BA.debugLine="Public Alignment As Int";
_alignment = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public SelectedDrawable(), Drawable1(), Drawable2";
_selecteddrawable = new Object[(int) (0)];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
_drawable1 = new Object[(int) (0)];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
_drawable2 = new Object[(int) (0)];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
 //BA.debugLineNum = 21;BA.debugLine="HeaderColor = Colors.Gray";
_headercolor = __c.Colors.Gray;
 //BA.debugLineNum = 22;BA.debugLine="RowHeight = 30dip";
_rowheight = __c.DipToCurrent((int) (30));
 //BA.debugLineNum = 23;BA.debugLine="TableColor = Colors.LightGray";
_tablecolor = __c.Colors.LightGray;
 //BA.debugLineNum = 24;BA.debugLine="FontColor = Colors.Black";
_fontcolor = __c.Colors.Black;
 //BA.debugLineNum = 25;BA.debugLine="HeaderFontColor = Colors.White";
_headerfontcolor = __c.Colors.White;
 //BA.debugLineNum = 26;BA.debugLine="FontSize = 14";
_fontsize = (float) (14);
 //BA.debugLineNum = 27;BA.debugLine="Alignment = Gravity.CENTER 'change to Gravity.LEF";
_alignment = __c.Gravity.CENTER;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _clearall() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub ClearAll";
 //BA.debugLineNum = 40;BA.debugLine="innerClearAll(NumberOfColumns)";
_innerclearall(_numberofcolumns);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.RiDD.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 220;BA.debugLine="Private Sub CreateNewLabels As Label()";
 //BA.debugLineNum = 221;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[_numberofcolumns];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 222;BA.debugLine="For I = 0 To NumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (_numberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 223;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.RiDD.table._rowcol();
 //BA.debugLineNum = 224;BA.debugLine="rc.Col = I";
_rc.Col /*int*/  = _i;
 //BA.debugLineNum = 225;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 226;BA.debugLine="l.Initialize(\"cell\")";
_l.Initialize(ba,"cell");
 //BA.debugLineNum = 227;BA.debugLine="l.Gravity = Alignment";
_l.setGravity(_alignment);
 //BA.debugLineNum = 228;BA.debugLine="l.TextSize = FontSize";
_l.setTextSize(_fontsize);
 //BA.debugLineNum = 229;BA.debugLine="l.TextColor = FontColor";
_l.setTextColor(_fontcolor);
 //BA.debugLineNum = 230;BA.debugLine="l.Tag = rc";
_l.setTag((Object)(_rc));
 //BA.debugLineNum = 231;BA.debugLine="lbls(I) = l";
_lbls[_i] = _l;
 }
};
 //BA.debugLineNum = 233;BA.debugLine="Return lbls";
if (true) return _lbls;
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(int _row) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.RiDD.table._rowcol _rc = null;
 //BA.debugLineNum = 203;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
 //BA.debugLineNum = 204;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 205;BA.debugLine="If LabelsCache.Size > 0 Then";
if (_labelscache.getSize()>0) { 
 //BA.debugLineNum = 207;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_labelscache.Get((int) (_labelscache.getSize()-1)));
 //BA.debugLineNum = 208;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
_labelscache.RemoveAt((int) (_labelscache.getSize()-1));
 }else {
 //BA.debugLineNum = 210;BA.debugLine="lbls = CreateNewLabels";
_lbls = _createnewlabels();
 };
 //BA.debugLineNum = 212;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 213;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.RiDD.table._rowcol();
 //BA.debugLineNum = 214;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.RiDD.table._rowcol)(_lbls[_i].getTag());
 //BA.debugLineNum = 215;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
 //BA.debugLineNum = 217;BA.debugLine="Return lbls";
if (true) return _lbls;
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public String  _getvalue(int _col,int _row) throws Exception{
String[] _values = null;
b4a.RiDD.manageusers _muser = null;
b4a.RiDD.riddqr _ridd_qr = null;
 //BA.debugLineNum = 276;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int)";
 //BA.debugLineNum = 278;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 279;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(_data.Get(_row));
 //BA.debugLineNum = 280;BA.debugLine="Dim mUser As ManageUsers = Starter.ManageUsers1";
_muser = (b4a.RiDD.manageusers)(_starter._manageusers1 /*Object*/ );
 //BA.debugLineNum = 281;BA.debugLine="mUser.lblUserDataN.Text = \"First Name: \" & values";
_muser._lbluserdatan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("First Name: "+_values[(int) (0)]));
 //BA.debugLineNum = 282;BA.debugLine="mUser.lblUserDataL.Text = \"Last Name: \" & values(";
_muser._lbluserdatal /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Last Name: "+_values[(int) (1)]));
 //BA.debugLineNum = 283;BA.debugLine="mUser.lblUserDataA.Text = \"Age: \" & values(2)";
_muser._lbluserdataa /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Age: "+_values[(int) (2)]));
 //BA.debugLineNum = 284;BA.debugLine="mUser.lblUserDataS.Text = \"Status: \" & values(3)";
_muser._lbluserdatas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Status: "+_values[(int) (3)]));
 //BA.debugLineNum = 288;BA.debugLine="mUser.summaryReport.Text = \"The \" & values(3) & \"";
_muser._summaryreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("The "+_values[(int) (3)]+" user named "+_values[(int) (0)]+" "+_values[(int) (1)]+", "+_values[(int) (2)]+" years of age has a possibility of having the following on the table below."));
 //BA.debugLineNum = 289;BA.debugLine="Dim ridd_qr As riddQR = Starter.riddQR1";
_ridd_qr = (b4a.RiDD.riddqr)(_starter._riddqr1 /*Object*/ );
 //BA.debugLineNum = 294;BA.debugLine="ridd_qr.lblQRNum.Text = values(0) & \" \" & value";
_ridd_qr._lblqrnum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_values[(int) (0)]+" "+_values[(int) (1)]));
 //BA.debugLineNum = 300;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public String  _header_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
 //BA.debugLineNum = 265;BA.debugLine="Private Sub Header_Click";
 //BA.debugLineNum = 266;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 267;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 268;BA.debugLine="l = Sender";
_l.setObject((android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 269;BA.debugLine="col = l.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
 //BA.debugLineNum = 270;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Th";
if (__c.SubExists(ba,_callback,_event+"_HeaderClick")) { 
 //BA.debugLineNum = 271;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
__c.CallSubNew2(ba,_callback,_event+"_HeaderClick",(Object)(_col));
 };
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(int _row) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub HideRow (Row As Int)";
 //BA.debugLineNum = 190;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 191;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));
 //BA.debugLineNum = 192;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
 //BA.debugLineNum = 193;BA.debugLine="Log(\"HideRow: (null) \" & Row)";
__c.LogImpl("810223621","HideRow: (null) "+BA.NumberToString(_row),0);
 //BA.debugLineNum = 194;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 196;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 197;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
 //BA.debugLineNum = 199;BA.debugLine="visibleRows.Remove(Row)";
_visiblerows.Remove((Object)(_row));
 //BA.debugLineNum = 200;BA.debugLine="LabelsCache.Add(lbls)";
_labelscache.Add((Object)(_lbls));
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callbackmodule,String _eventname,int _vnumberofcolumns) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (CallbackModule As Object, E";
 //BA.debugLineNum = 31;BA.debugLine="SV.Initialize2(0, \"SV\")";
_sv.Initialize2(ba,(int) (0),"SV");
 //BA.debugLineNum = 32;BA.debugLine="SV.Panel.Color = TableColor";
_sv.getPanel().setColor(_tablecolor);
 //BA.debugLineNum = 33;BA.debugLine="Callback = CallbackModule";
_callback = _callbackmodule;
 //BA.debugLineNum = 34;BA.debugLine="Event = EventName";
_event = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="innerClearAll(vNumberOfColumns)";
_innerclearall(_vnumberofcolumns);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _innerclearall(int _vnumberofcolumns) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
 //BA.debugLineNum = 64;BA.debugLine="public Sub innerClearAll(vNumberOfColumns As Int)";
 //BA.debugLineNum = 65;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_sv.getPanel().getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 66;BA.debugLine="SV.Panel.RemoveViewAt(i)";
_sv.getPanel().RemoveViewAt(_i);
 }
};
 //BA.debugLineNum = 68;BA.debugLine="NumberOfColumns = vNumberOfColumns";
_numberofcolumns = _vnumberofcolumns;
 //BA.debugLineNum = 69;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
_drawable1 = new Object[_numberofcolumns];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
 //BA.debugLineNum = 70;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
_drawable2 = new Object[_numberofcolumns];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
 //BA.debugLineNum = 71;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
_selecteddrawable = new Object[_numberofcolumns];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
 //BA.debugLineNum = 72;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (_numberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 73;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 74;BA.debugLine="cd1.Initialize(Colors.White, 0)";
_cd1.Initialize(__c.Colors.White,(int) (0));
 //BA.debugLineNum = 75;BA.debugLine="cd2.Initialize(0xFF98F5FF, 0)";
_cd2.Initialize((int) (0xff98f5ff),(int) (0));
 //BA.debugLineNum = 76;BA.debugLine="cd3.Initialize(0xFF007FFF, 0)";
_cd3.Initialize((int) (0xff007fff),(int) (0));
 //BA.debugLineNum = 77;BA.debugLine="Drawable1(i) = cd1";
_drawable1[_i] = (Object)(_cd1.getObject());
 //BA.debugLineNum = 78;BA.debugLine="Drawable2(i) = cd2";
_drawable2[_i] = (Object)(_cd2.getObject());
 //BA.debugLineNum = 79;BA.debugLine="SelectedDrawable(i) = cd3";
_selecteddrawable[_i] = (Object)(_cd3.getObject());
 }
};
 //BA.debugLineNum = 81;BA.debugLine="SV.Panel.Height = 0";
_sv.getPanel().setHeight((int) (0));
 //BA.debugLineNum = 82;BA.debugLine="SelectedRow = -1";
_selectedrow = (int) (-1);
 //BA.debugLineNum = 83;BA.debugLine="minVisibleRow = -1";
_minvisiblerow = (int) (-1);
 //BA.debugLineNum = 84;BA.debugLine="maxVisibleRow = 0";
_maxvisiblerow = (int) (0);
 //BA.debugLineNum = 85;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="LabelsCache.Initialize";
_labelscache.Initialize();
 //BA.debugLineNum = 87;BA.debugLine="visibleRows.Initialize";
_visiblerows.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="SV.ScrollPosition = 0";
_sv.setScrollPosition((int) (0));
 //BA.debugLineNum = 89;BA.debugLine="DoEvents";
__c.DoEvents();
 //BA.debugLineNum = 90;BA.debugLine="SV.ScrollPosition = 0";
_sv.setScrollPosition((int) (0));
 //BA.debugLineNum = 91;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step27 = 1;
final int limit27 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 92;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
_labelscache.Add((Object)(_createnewlabels()));
 }
};
 //BA.debugLineNum = 94;BA.debugLine="If visible Then";
if (_visible) { 
 //BA.debugLineNum = 95;BA.debugLine="SV_ScrollChanged(0)";
_sv_scrollchanged((int) (0));
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(int _row) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean";
 //BA.debugLineNum = 184;BA.debugLine="Return Row < (SV.ScrollPosition + SV.Height) / (R";
if (true) return _row<(_sv.getScrollPosition()+_sv.getHeight())/(double)(_rowheight+1) && _row>_sv.getScrollPosition()/(double)_rowheight;
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return false;
}
public String  _jumptorow(int _row) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Public Sub JumpToRow(Row As Int)";
 //BA.debugLineNum = 336;BA.debugLine="SV.ScrollPosition = Row * RowHeight";
_sv.setScrollPosition((int) (_row*_rowheight));
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv(String _dir,String _filename,boolean _headersexist) throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
String[] _row = null;
 //BA.debugLineNum = 341;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
 //BA.debugLineNum = 343;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 344;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 345;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
 //BA.debugLineNum = 346;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 347;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = _stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
 //BA.debugLineNum = 348;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 349;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 350;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
 //BA.debugLineNum = 353;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = _stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(","));
 //BA.debugLineNum = 354;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
 //BA.debugLineNum = 355;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
 //BA.debugLineNum = 356;BA.debugLine="Dim h(firstRow.Length)";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 357;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 358;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
 //BA.debugLineNum = 361;BA.debugLine="innerClearAll(h.Length)";
_innerclearall(_h.length);
 //BA.debugLineNum = 362;BA.debugLine="ColumnWidth = SV.Width / NumberOfColumns";
_columnwidth = (int) (_sv.getWidth()/(double)_numberofcolumns);
 //BA.debugLineNum = 363;BA.debugLine="SetHeader(h)";
_setheader(_h);
 //BA.debugLineNum = 364;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 365;BA.debugLine="Dim row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
 //BA.debugLineNum = 366;BA.debugLine="row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
 //BA.debugLineNum = 367;BA.debugLine="AddRow(row)";
_addrow(_row);
 }
};
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return "";
}
public String  _savetabletocsv(String _dir,String _filename) throws Exception{
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 380;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
 //BA.debugLineNum = 381;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[_numberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 382;BA.debugLine="For i = 0 To headers.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_headers.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 383;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 384;BA.debugLine="l = Header.GetView(i)";
_l.setObject((android.widget.TextView)(_header.GetView(_i).getObject()));
 //BA.debugLineNum = 385;BA.debugLine="headers(i) = l.Text";
_headers[_i] = _l.getText();
 }
};
 //BA.debugLineNum = 387;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, h";
_stringutils1.SaveCSV2(_dir,_filename,BA.ObjectToChar(","),_data,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(int _row) throws Exception{
int _prev = 0;
int _col = 0;
 //BA.debugLineNum = 314;BA.debugLine="Private Sub SelectRow(Row As Int)";
 //BA.debugLineNum = 315;BA.debugLine="Dim prev As Int";
_prev = 0;
 //BA.debugLineNum = 316;BA.debugLine="prev = SelectedRow";
_prev = _selectedrow;
 //BA.debugLineNum = 317;BA.debugLine="SelectedRow = Row";
_selectedrow = _row;
 //BA.debugLineNum = 319;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
 //BA.debugLineNum = 320;BA.debugLine="If visibleRows.ContainsKey(prev) Then";
if (_visiblerows.ContainsKey((Object)(_prev))) { 
 //BA.debugLineNum = 321;BA.debugLine="HideRow(prev)";
_hiderow(_prev);
 //BA.debugLineNum = 322;BA.debugLine="ShowRow(prev)";
_showrow(_prev);
 };
 };
 //BA.debugLineNum = 325;BA.debugLine="SelectedRow = Row";
_selectedrow = _row;
 //BA.debugLineNum = 326;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_numberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
 //BA.debugLineNum = 327;BA.debugLine="If visibleRows.ContainsKey(SelectedRow) Then";
if (_visiblerows.ContainsKey((Object)(_selectedrow))) { 
 //BA.debugLineNum = 328;BA.debugLine="HideRow(SelectedRow)";
_hiderow(_selectedrow);
 //BA.debugLineNum = 329;BA.debugLine="ShowRow(SelectedRow)";
_showrow(_selectedrow);
 };
 }
};
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnswidths(int[] _widths) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _lbl = 0;
 //BA.debugLineNum = 45;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
 //BA.debugLineNum = 46;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="For i = 0 To Widths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_widths.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 48;BA.debugLine="v = Header.GetView(i)";
_v = _header.GetView(_i);
 //BA.debugLineNum = 49;BA.debugLine="v.Width = Widths(i) - 1dip";
_v.setWidth((int) (_widths[_i]-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 50;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 51;BA.debugLine="v.Left = Header.GetView(i-1).Left + Widths(i-1)";
_v.setLeft((int) (_header.GetView((int) (_i-1)).getLeft()+_widths[(int) (_i-1)]+__c.DipToCurrent((int) (1))));
 };
 }
};
 //BA.debugLineNum = 54;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 55;BA.debugLine="For i = 0 To visibleRows.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_visiblerows.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 56;BA.debugLine="lbls = visibleRows.GetValueAt(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.GetValueAt(_i));
 //BA.debugLineNum = 57;BA.debugLine="For lbl = 0 To lbls.Length - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lbls.length-1);
_lbl = (int) (0) ;
for (;_lbl <= limit12 ;_lbl = _lbl + step12 ) {
 //BA.debugLineNum = 58;BA.debugLine="lbls(lbl).SetLayout(Header.GetView(lbl).Left, l";
_lbls[_lbl].SetLayout(_header.GetView(_lbl).getLeft(),_lbls[_lbl].getTop(),_header.GetView(_lbl).getWidth(),_rowheight);
 }
};
 }
};
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _setdatagrid(String[] _headerx,anywheresoftware.b4a.objects.collections.List _x) throws Exception{
Object _a = null;
 //BA.debugLineNum = 370;BA.debugLine="public Sub SetDatagrid(HeaderX() As String,x As Li";
 //BA.debugLineNum = 372;BA.debugLine="innerClearAll(HeaderX.Length)";
_innerclearall(_headerx.length);
 //BA.debugLineNum = 373;BA.debugLine="ColumnWidth = SV.Width / NumberOfColumns";
_columnwidth = (int) (_sv.getWidth()/(double)_numberofcolumns);
 //BA.debugLineNum = 374;BA.debugLine="SetHeader(HeaderX)";
_setheader(_headerx);
 //BA.debugLineNum = 375;BA.debugLine="For Each a In x";
{
final anywheresoftware.b4a.BA.IterableList group4 = _x;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_a = group4.Get(index4);
 //BA.debugLineNum = 376;BA.debugLine="AddRow(a)";
_addrow((String[])(_a));
 }
};
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public String  _setheader(String[] _values) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 237;BA.debugLine="Public Sub SetHeader(Values() As String)";
 //BA.debugLineNum = 238;BA.debugLine="For I = Header.NumberOfViews - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_header.getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 239;BA.debugLine="Header.RemoveViewAt(I)";
_header.RemoveViewAt(_i);
 }
};
 //BA.debugLineNum = 241;BA.debugLine="For I = 0 To NumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (_numberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 242;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 243;BA.debugLine="l.Initialize(\"header\")";
_l.Initialize(ba,"header");
 //BA.debugLineNum = 244;BA.debugLine="l.Gravity = Gravity.CENTER";
_l.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 245;BA.debugLine="l.TextSize = FontSize";
_l.setTextSize(_fontsize);
 //BA.debugLineNum = 246;BA.debugLine="l.Color = HeaderColor";
_l.setColor(_headercolor);
 //BA.debugLineNum = 247;BA.debugLine="l.TextColor = HeaderFontColor";
_l.setTextColor(_headerfontcolor);
 //BA.debugLineNum = 248;BA.debugLine="l.Text = Values(I)";
_l.setText(BA.ObjectToCharSequence(_values[_i]));
 //BA.debugLineNum = 249;BA.debugLine="l.Tag = I";
_l.setTag((Object)(_i));
 //BA.debugLineNum = 250;BA.debugLine="Header.AddView(l, ColumnWidth * I, 0, ColumnWidt";
_header.AddView((android.view.View)(_l.getObject()),(int) (_columnwidth*_i),(int) (0),(int) (_columnwidth-__c.DipToCurrent((int) (1))),_rowheight);
 }
};
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(int _col,int _row,String _value) throws Exception{
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
 //BA.debugLineNum = 303;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
 //BA.debugLineNum = 304;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 305;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(_data.Get(_row));
 //BA.debugLineNum = 306;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
 //BA.debugLineNum = 307;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (_visiblerows.ContainsKey((Object)(_row))) { 
 //BA.debugLineNum = 308;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 309;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));
 //BA.debugLineNum = 310;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _showrow(int _row) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
String[] _values = null;
Object[] _rowcolor = null;
int _i = 0;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub ShowRow(row As Int)";
 //BA.debugLineNum = 160;BA.debugLine="If visibleRows.ContainsKey(row) Then Return";
if (_visiblerows.ContainsKey((Object)(_row))) { 
if (true) return "";};
 //BA.debugLineNum = 162;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 163;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 164;BA.debugLine="lbls = GetLabels(row)";
_lbls = _getlabels(_row);
 //BA.debugLineNum = 165;BA.debugLine="values = Data.Get(row)";
_values = (String[])(_data.Get(_row));
 //BA.debugLineNum = 166;BA.debugLine="visibleRows.Put(row, lbls)";
_visiblerows.Put((Object)(_row),(Object)(_lbls));
 //BA.debugLineNum = 167;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
 //BA.debugLineNum = 168;BA.debugLine="If row = SelectedRow Then";
if (_row==_selectedrow) { 
 //BA.debugLineNum = 169;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = _selecteddrawable;
 }else if(_row%2==0) { 
 //BA.debugLineNum = 171;BA.debugLine="rowColor = Drawable1";
_rowcolor = _drawable1;
 }else {
 //BA.debugLineNum = 173;BA.debugLine="rowColor = Drawable2";
_rowcolor = _drawable2;
 };
 //BA.debugLineNum = 175;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 176;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Left";
_sv.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),_header.GetView(_i).getLeft(),(int) (_row*_rowheight),_header.GetView(_i).getWidth(),(int) (_rowheight-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 178;BA.debugLine="lbls(I).Text = values(I)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
 //BA.debugLineNum = 179;BA.debugLine="lbls(I).Background = rowColor(I)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 }
};
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(int _position) throws Exception{
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
 //BA.debugLineNum = 99;BA.debugLine="Private Sub SV_ScrollChanged(Position As Int)";
 //BA.debugLineNum = 100;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
 //BA.debugLineNum = 101;BA.debugLine="currentMin = Max(0, Position / RowHeight - 30)";
_currentmin = (int) (__c.Max(0,_position/(double)_rowheight-30));
 //BA.debugLineNum = 102;BA.debugLine="currentMax = Min(Data.Size - 1, (Position + SV.He";
_currentmax = (int) (__c.Min(_data.getSize()-1,(_position+_sv.getHeight())/(double)_rowheight+30));
 //BA.debugLineNum = 103;BA.debugLine="If minVisibleRow > -1 Then";
if (_minvisiblerow>-1) { 
 //BA.debugLineNum = 104;BA.debugLine="If minVisibleRow < currentMin Then";
if (_minvisiblerow<_currentmin) { 
 //BA.debugLineNum = 106;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,_maxvisiblerow));
_i = _minvisiblerow ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 107;BA.debugLine="HideRow(I)";
_hiderow(_i);
 }
};
 }else if(_minvisiblerow>_currentmin) { 
 //BA.debugLineNum = 111;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(_minvisiblerow-1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 112;BA.debugLine="ShowRow(I)";
_showrow(_i);
 }
};
 };
 //BA.debugLineNum = 115;BA.debugLine="If maxVisibleRow > currentMax Then";
if (_maxvisiblerow>_currentmax) { 
 //BA.debugLineNum = 117;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,_minvisiblerow));
_i = _maxvisiblerow ;
for (;_i >= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 118;BA.debugLine="HideRow(I)";
_hiderow(_i);
 }
};
 }else if(_maxvisiblerow<_currentmax) { 
 //BA.debugLineNum = 122;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(_maxvisiblerow+1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
 //BA.debugLineNum = 123;BA.debugLine="ShowRow(I)";
_showrow(_i);
 }
};
 };
 };
 //BA.debugLineNum = 127;BA.debugLine="minVisibleRow = currentMin";
_minvisiblerow = _currentmin;
 //BA.debugLineNum = 128;BA.debugLine="maxVisibleRow = currentMax";
_maxvisiblerow = _currentmax;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

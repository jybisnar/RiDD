B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	Dim MainPageA As ImageView
	Dim lblQRNum As Label
	Dim QPushButton6 As Button
	Dim QR As ToggleButton
	Dim img As BitmapDrawable
	
	

End Sub
'clsTest.Initialize(Me, "clsTest")
'clsTest.AddToParent(Activity,0,0,100%x,100%y)
Public Sub AddToParent(Parent As Activity, Left As Int, Top As Int, Width As Int,Height As Int)
	mBase.Initialize("mBase")
	Parent.AddView(mBase, Left, Top, Width, Height)
	GTKForms
End Sub
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	MainPageA.Initialize("MainPage")
	QR.Initialize("QR")
	lblQRNum.Initialize("lblQRNum")
	QPushButton6.Initialize("QPushButton6")
	img.Initialize(LoadBitmap(File.DirAssets, "RiDDOFF.png"))
	img.Gravity = Gravity.FILL
	

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(MainPageA,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	MainPageA.Bitmap = LoadBitmapResize(File.DirAssets,"joey4.png",MainPageA.Width,MainPageA.Height,False)
	lblQRNum.Color =  0x00ffffff
	lblQRNum.TextColor = 0xff000000
	lblQRNum.Gravity = Gravity.Left
	lblQRNum.Text = ""
	mBase.AddView(lblQRNum,0.05 * mBase.Width,0.74 * mBase.Height,0.91 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(QPushButton6,0.05 * mBase.Width,0.87 * mBase.Height,0.91 * mBase.Width,0.07 * mBase.Height)
	QPushButton6.Text = "RiDD Controls"
	QPushButton6.TextColor= Colors.Black'Colors.RGB(51,255,153)
	QPushButton6.Color = Colors.RGB(153,255,204)
	mBase.AddView(QR,0.05 * mBase.Width,0.12 * mBase.Height,0.91 * mBase.Width,0.67 * mBase.Height)
	QR.Color =  0x00ffffff
	QR.TextColor = 0xff000000
	QR.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	QR.TextOff = " "
	QR.TextOn = " "
	QR.Background = img

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub MainPage_click()
End Sub
Sub QR_CheckedChange(Checked As Boolean)
	If Checked = True Then
		img.Initialize(LoadBitmap(File.DirAssets, "RiDDON.png"))
	Else
		img.Initialize(LoadBitmap(File.DirAssets, "RiDDOFF.png"))
	End If
	img.Gravity = Gravity.FILL
	QR.Background = img
End Sub
Sub lblQRNum_click()
End Sub
Sub QPushButton6_click()
	Dim xx As RiDDMain = Starter.RiDDMain1
	xx.Visible = True
	setVisible(False)
End Sub

Public Sub getVisible() As Boolean
	Return mBase.Visible
End Sub
Public Sub setVisible(flag As Boolean)
	mBase.Visible=flag
End Sub
Public Sub SetLayout(Left As Int,Top As Int,Width As Int,Height As Int)
	mBase.SetLayout(Left,Top,Width,Height )
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

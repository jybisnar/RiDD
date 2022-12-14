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
	Dim img As ImageView
	Dim btnBack As Button
	Dim btnAddUser As Button
	Dim rbtnYes As RadioButton
	Dim rbtnN As RadioButton
	Dim txtName As EditText
	Dim txtAge As EditText

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
	img.Initialize("img")
	btnBack.Initialize("btnBack")
	btnAddUser.Initialize("btnAddUser")
	rbtnYes.Initialize("rbtnYes")
	rbtnN.Initialize("rbtnN")
	txtName.Initialize("txtName")
	txtAge.Initialize("txtAge")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(img,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	img.Bitmap = LoadBitmapResize(File.DirAssets,"joey3.png",img.Width,img.Height,False)
	mBase.AddView(btnBack,0.05 * mBase.Width,0.02 * mBase.Height,0.19 * mBase.Width,0.05 * mBase.Height)
	btnBack.Text = "Back"
	btnBack.Color = 0xff000000
	mBase.AddView(btnAddUser,0.07 * mBase.Width,0.50 * mBase.Height,0.87 * mBase.Width,0.09 * mBase.Height)
	btnAddUser.TextSize = 21
	btnAddUser.Text = "Add User"
	btnAddUser.Color = 0xff000000
	mBase.AddView(rbtnYes,0.27 * mBase.Width,0.39 * mBase.Height,0.24 * mBase.Width,0.03 * mBase.Height)
	rbtnYes.Text="Yes"
	mBase.AddView(rbtnN,0.60 * mBase.Width,0.39 * mBase.Height,0.24 * mBase.Width,0.03 * mBase.Height)
	rbtnN.Text="No"
	mBase.AddView(txtName,0.07 * mBase.Width,0.17 * mBase.Height,0.87 * mBase.Width,0.05 * mBase.Height)
	txtName.TextColor=Colors.black
	Private cd As ColorDrawable
	cd.Initialize(Colors.Transparent, 0)
	txtName.Background = cd
	txtName.Gravity = Gravity.CENTER
	txtName.InputType = txtName.INPUT_TYPE_TEXT	
	mBase.AddView(txtAge,0.07 * mBase.Width,0.27 * mBase.Height,0.87 * mBase.Width,0.05 * mBase.Height)
	txtAge.TextColor=Colors.black
	txtAge.Gravity = Gravity.CENTER
	txtAge.Background = cd
	txtAge.InputType = txtAge.INPUT_TYPE_NUMBERS

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Main_click()
End Sub
Sub btnBack_click()
	Dim xx As ManageUsers = Starter.ManageUsers1
	xx.Visible = True
	setVisible(False)
End Sub
Sub btnAddUser_click()
End Sub
Sub rbtnYes_CheckedChange(Checked As Boolean)
End Sub
Sub rbtnNo_CheckedChange(Checked As Boolean)
End Sub
Sub txtName_click()
End Sub
Sub txtAge_click()
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

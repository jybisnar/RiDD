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
	'For the custom view
	Dim img As ImageView
	Dim btnBack As Button
	Dim btnAddUser As Button
	Dim dtgUser As Table
	Dim summaryReportLabel As Label
	Dim summaryReport As Label
	Dim lblUserDataN As Label
	Dim lblUserDataL As Label
	Dim lblUserDataA As Label
	Dim lblUserDataS As Label
	Dim lblUserDataI As Label
	Dim txtSearch As EditText
	Dim genQR As Button
	'Dim pastData As Button
	Dim dtgIdd As Table
	
	'For Enrolling Users
	Private DetailsDialog As CustomLayoutDialog
	Private DialogAge As Spinner
	Private DialogYesNO As Spinner
	Private DialogLastName As FloatLabeledEditText
	Private DialogFirstName As FloatLabeledEditText
	'For Generating QR
	Private DetailsQR As CustomLayoutDialog
	Private qrcode As QRGenerator
	Private imgVQR As B4XView
	Private lblQRNum As Label
	Private BmpQR, logo As B4XBitmap
	Private xui As XUI
	'For Past Data
	'Private DetailsData As CustomLayoutDialog
	'Private ListView1 As ListView
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
	txtSearch.Initialize("txtSearch")
	dtgUser.Initialize(Me,"dtgUser",4)
	'dtgUser.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,dtgUser,"History")
	summaryReportLabel.Initialize("summaryReportLabel")
	summaryReport.Initialize("summaryReport")
	lblUserDataN.Initialize("lblUserDataN")
	lblUserDataL.Initialize("lblUserDataL")
	lblUserDataA.Initialize("lblUserDataA")
	lblUserDataS.Initialize("lblUserDataS")
	lblUserDataI.Initialize("lblUserDataI")
	genQR.Initialize("genQR")
'	pastData.Initialize("pastData")
	dtgIdd.Initialize(Me,"dtgIdd",4)
	'Dim a As riddQR = Starter.riddQR1
	'qrcode.Initialize(a.qrc.Width)
'	dtgIdd.Initialize("dtgIdd")
'	dtgIdd.AddSingleLine("")

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
	img.Bitmap = LoadBitmapResize(File.DirAssets,"joey2.png",img.Width,img.Height,False)
	mBase.AddView(btnBack,0.05 * mBase.Width,0.02 * mBase.Height,0.19 * mBase.Width,0.05 * mBase.Height)
	btnBack.Text = "Back"
	btnBack.Color = Colors.RGB(153,255,204)
	btnBack.TextColor = Colors.Black
	mBase.AddView(btnAddUser,0.73 * mBase.Width,0.02 * mBase.Height,0.23 * mBase.Width,0.05 * mBase.Height)
	btnAddUser.Text = "Enroll a User"
	btnAddUser.Color = Colors.RGB(153,255,204)
	btnAddUser.TextColor = Colors.Black
	dtgUser.AddToParent(mBase,0.05 * mBase.Width,0.18 * mBase.Height,0.91 * mBase.Width,0.3 * mBase.Height)
	'dtgUser.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	'dtgUser.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))
	summaryReportLabel.Color =  Colors.DarkGray
	summaryReportLabel.Gravity = Gravity.Left
	summaryReportLabel.Text = "Summary Report of a RiDD Device User"
	summaryReportLabel.TextSize = 21
	summaryReportLabel.TextColor = Colors.White
	summaryReportLabel.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	mBase.AddView(summaryReportLabel,0.05 * mBase.Width,0.49 * mBase.Height,0.91 * mBase.Width,0.04 * mBase.Height)
	dtgIdd.AddToParent(mBase,0.05 * mBase.Width,0.64 * mBase.Height,0.91 * mBase.Width,0.44 * mBase.Height)
	lblUserDataN.Color =  0x00ffffff
	lblUserDataN.TextColor = 0xff000000
	lblUserDataN.Gravity = Gravity.Left
	lblUserDataN.Text = ""
	mBase.AddView(lblUserDataN,0.05 * mBase.Width,0.53 * mBase.Height,0.6 * mBase.Width,0.05 * mBase.Height)
	lblUserDataL.Color =  0x00ffffff
	lblUserDataL.TextColor = 0xff000000
	lblUserDataL.Gravity = Gravity.Left
	lblUserDataL.Text = ""
	mBase.AddView(lblUserDataL,0.05 * mBase.Width,0.55 * mBase.Height,0.6 * mBase.Width,0.05 * mBase.Height)
	lblUserDataA.Color =  0x00ffffff
	lblUserDataA.TextColor = 0xff000000
	lblUserDataA.Gravity = Gravity.Left
	lblUserDataA.Text = ""
	mBase.AddView(lblUserDataA,0.05 * mBase.Width,0.57 * mBase.Height,0.6 * mBase.Width,0.05 * mBase.Height)
	lblUserDataS.Color =  0x00ffffff
	lblUserDataS.TextColor = 0xff000000
	lblUserDataS.Gravity = Gravity.Left
	lblUserDataS.Text = ""
	mBase.AddView(lblUserDataS,0.05 * mBase.Width,0.59 * mBase.Height,0.6 * mBase.Width,0.05 * mBase.Height)
	lblUserDataI.Color =  0x00ffffff
	lblUserDataI.TextColor = 0xff000000
	lblUserDataI.Gravity = Gravity.Left
	lblUserDataI.Text = ""
	mBase.AddView(lblUserDataI,0.05 * mBase.Width,0.61 * mBase.Height,0.6 * mBase.Width,0.05 * mBase.Height)
	summaryReport.Color =  0x00ffffff
	summaryReport.TextColor = 0xff000000
	summaryReport.Gravity = Gravity.Left
	summaryReport.Text = ""
	summaryReport.TextSize = 15
	summaryReport.Text = summaryReport.Text.ToUpperCase
	mBase.AddView(summaryReport,0.4 * mBase.Width,0.53 * mBase.Height,0.58 * mBase.Width,0.3 * mBase.Height)
	'mBase.AddView(summaryReport,0.05 * mBase.Width,0.67 * mBase.Height,0.34 * mBase.Width,0.3 * mBase.Height)
	'dtgIdd.AddToParent(mBase,0.0 * mBase.Width,0.56 * mBase.Height,0.58 * mBase.Width,0.44 * mBase.Height)
	txtSearch.Color =  Colors.LightGray
	txtSearch.TextColor = 0xff000000
	txtSearch.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	txtSearch.Hint = "Search User"
	mBase.AddView(txtSearch,0.05 * mBase.Width,0.11 * mBase.Height,0.91 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(genQR,0.73 * mBase.Width,0.89 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
	genQR.Text = "Generate QR"
	genQR.Color = Colors.RGB(153,255,204)
	genQR.TextColor = Colors.Black
'	mBase.AddView(pastData,0.05 * mBase.Width,0.89 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
'	pastData.Text = "View Past Data"
'	pastData.Color = 0xff000000

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Main_click()
End Sub
Sub btnBack_click()
	Dim xx As RiDDMain = Starter.RiDDMain1
	xx.Visible = True
	setVisible(False)
'	Starter.wsh.Querry("delete from riddUserA","")
End Sub
Sub btnAddUser_click()
'	Dim aa As AddUser = Starter.AddUser1
'	aa.Visible = True
'	setVisible(False)
	lblUserDataN.Text = ""
	lblUserDataL.Text = ""
	lblUserDataA.Text = ""
	lblUserDataS.Text = ""
	lblUserDataI.Text = ""
	summaryReport.Text = ""
	Dim sf As Object = DetailsDialog.ShowAsync("Enroll a User:", "Ok", "Cancel", "", LoadBitmap(File.DirAssets, "form.png"), True)
	DetailsDialog.SetSize(100%x, 500dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("DetailsDialog")
	'0x00002000 = TYPE_TEXT_FLAG_CAP_WORDS (capitalize first character of each word)
	DialogFirstName.EditText.InputType = Bit.Or(0x00002000, DialogFirstName.EditText.InputType)
	DialogLastName.EditText.InputType = Bit.Or(0x00002000, DialogLastName.EditText.InputType)
	DialogAge.Add("")
	For i = 1 To 100
		DialogAge.Add(i)
	Next
	DialogYesNO.Add("")
	For x = 1 To 1
		DialogYesNO.Add("lactating")
		DialogYesNO.Add("non lactating")
	Next
	DetailsDialog.GetButton(DialogResponse.POSITIVE).Enabled = False
	Wait For (sf) Dialog_Result(res As Int)
	'forces the keyboard to hide
	DialogFirstName.EditText.Enabled = False
	DialogLastName.EditText.Enabled = False
	If res = DialogResponse.POSITIVE Then
'		dito ung database prompt
		'Starter.wsh.Querry("CREATE TABLE riddUserA(fname CHAR(50),lname CHAR(50),age CHAR(50),status CHAR(50), idd CHAR (50), Date datetime)","")
		Dim sql As String
		sql=$"insert into riddUserA(fname,lname,age,status) values ('${DialogFirstName.Text}','${DialogLastName.Text}','${DialogAge.SelectedItem}', '${DialogYesNO.SelectedItem}')"$
		Starter.wsh.Querry(sql,"")
		Starter.waiting=True
		Starter.wsh.Querry("select fname,lname,age,status,idd from riddUserA","QUERRYManageUsers")
		'Starter.wsh.Querry("select fname,lname,age,status,idd from riddUserA","QUERRYLatestIdd")
		Starter.wsh.Querry("select fname,lname from riddUserA","QUERRYMain")
		Starter.wsh.Querry("select idd from riddUserA","QUERRYLatestIdd")
		
		Do While Starter.waiting=True
			Sleep(0)
		Loop
		ToastMessageShow($"${DialogFirstName.Text} ${DialogLastName.Text} is ${DialogAge.SelectedItem} years old and is a ${DialogYesNO.SelectedItem} person."$, True)
	End If
End Sub

Sub DialogAge_ItemClick (Position As Int, Value As Object)
	CheckAllFieldsValid
End Sub

Sub DialogYesNO_ItemClick (Position As Int, Value As Object)
	CheckAllFieldsValid
End Sub

Sub DialogLastName_TextChanged (Old As String, New As String)
	CheckAllFieldsValid
End Sub

Sub DialogFirstName_TextChanged (Old As String, New As String)
	CheckAllFieldsValid
End Sub

Sub CheckAllFieldsValid
	Dim valid As Boolean = DialogAge.SelectedIndex > 0 And DialogYesNO.SelectedIndex > 0 And DialogFirstName.Text.Length > 0 And DialogLastName.Text.Length > 0
	DetailsDialog.GetButton(DialogResponse.POSITIVE).Enabled = valid
End Sub

Sub txtSearch_TextChanged (Old As String, New As String)
	Starter.wsh.Querry("select fname,lname,age,status,idd from riddUserA where fname like '%" & New & "%' or lname like '%" & New & "%' or age like '%" & New & "%' or status like '%" & New & "%' or idd like '%" & New & "%'","QUERRYManageUsers")
End Sub
Sub dtgUser_CellClick (Col As Int,Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = dtgUser.GetValue(Col,Row)
End Sub

Sub lblUserDataN_click()
End Sub
Sub lblUserDataL_click()
End Sub
Sub lblUserDataA_click()
End Sub
Sub lblUserDataS_click()
End Sub
Sub lblUserDataI_click()
End Sub
Sub summ_click()
End Sub
Sub summaryReportLabel_click()
End Sub
Sub summaryReport_click()
End Sub
'Sub dtgIdd_ItemClick (Position As Int, Value As Object)
'	dtgIdd.AddSingleLine(Starter.wsh.Querry("select iddA riddUserA2",""))
'End Sub
'Sub pastData_click()
'	Dim pastD As Object = DetailsData.ShowAsync("Enroll a User:", "OK", "", "", LoadBitmap(File.DirAssets, "form.png"), True)
'	DetailsData.SetSize(100%x, 500dip)
'	Wait For (pastD) Dialog_Ready(pnl As Panel)
'	pnl.LoadLayout("pData")
'	DetailsData.GetButton(DialogResponse.POSITIVE).Enabled = True
'	Wait For (pastD) Dialog_Result(res As Int)
'	'force the keyboard to hide
'	If res = DialogResponse.POSITIVE Then
'	End If
'End Sub
Sub genQR_click()
	Dim qrgen As Object = DetailsQR.ShowAsync("Enroll a User:", "OK", "", "", LoadBitmap(File.DirAssets, "form.png"), True)
	DetailsQR.SetSize(100%x, 500dip)
	Wait For (qrgen) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("RiDDQr")
	'0x00002000 = TYPE_TEXT_FLAG_CAP_WORDS (capitalize first character of each word)
	qrcode.Initialize(imgVQR.Width)
	Dim a As riddQR = Starter.riddQR1
	Dim b As String = a.lblQRNum.Text
'	Try
'		If b <> 0 Then
'			Msgbox("You selected an empty cell.", "Select again")
'		End If
'	Catch
'		Log(LastException)
'		'Msgbox("You selected an empty cell.", "Select again")
'	End Try
	BmpQR = qrcode.Create(lblQRNum.Text)
	logo = xui.LoadBitmapResize(File.DirAssets,"RIDD PAGING.jpg",BmpQR.Width,BmpQR.height,True)
	lblQRNum.Text = b
	imgVQR.SetBitmap(qrcode.AddBitmap(BmpQR, logo, 255 * 0 / 100).Resize(imgVQR.Width, imgVQR.Height, True))
	DetailsQR.GetButton(DialogResponse.POSITIVE).Enabled = True
	Wait For (qrgen) Dialog_Result(res As Int)
	'force the keyboard to hide
	If res = DialogResponse.POSITIVE Then
		ToastMessageShow($"${lblQRNum.Text} is the QR code."$, True)
	End If
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

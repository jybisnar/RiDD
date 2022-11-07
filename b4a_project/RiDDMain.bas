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
	Dim btnManageUser As Button
	Dim QFrame4 As Panel
	Dim QFrame5 As Panel
	Dim QFrame6 As Table
	'Dim img1 As BitmapDrawable
	Dim TabHost1 As TabHost
	Dim btnLogout As Button

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
	btnManageUser.Initialize("btnManageUser")
	QFrame4.Initialize("QFrame4")
	QFrame5.Initialize("QFrame5")
	QFrame6.Initialize(Me,"QFrame6",4)
	TabHost1.Initialize("TabHost1")
	btnLogout.Initialize("btnLogout")
	'img1.Initialize(LoadBitmap(File.DirAssets, "plus.png"))
	'img1.Gravity = Gravity.FILL

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
	img.Bitmap = LoadBitmapResize(File.DirAssets,"joey1.png",img.Width,img.Height,False)
	mBase.AddView(btnManageUser,0.62 * mBase.Width,0.02 * mBase.Height,0.30 * mBase.Width,0.05 * mBase.Height)
	btnManageUser.Text = "Manage Users"
	btnManageUser.Color = Colors.RGB(153,255,204)
	btnManageUser.TextColor = Colors.Black
	'btnManageUser.SetBackgroundImage(LoadBitmap(File.DirAssets, "plus.png"))
	'btnManageUser.Gravity = Gravity.CENTER
	btnLogout.Text = "Log Out"
	btnLogout.Color = Colors.RGB(153,255,204)
	btnLogout.TextColor = Colors.Black
	mBase.AddView(btnLogout,0.73 * mBase.Width,0.89 * mBase.Height,0.30* mBase.Width,0.06 * mBase.Height)
	mBase.AddView(QFrame4,0.07 * mBase.Width,0.15 * mBase.Height,0.85 * mBase.Width,0.17 * mBase.Height)
	QFrame4.Color =  0x00ffffff
	CreatePieTab
	mBase.AddView(QFrame5,0.07 * mBase.Width,0.39 * mBase.Height,0.85 * mBase.Width,0.231 * mBase.Height)
	QFrame5.Color =  0x00ffffff
	CreateBarsTab
	QFrame6.AddToParent(mBase, 0.07 * mBase.Width,0.69 * mBase.Height,0.85 * mBase.Width,0.30 * mBase.Height)
	'mBase.AddView(QFrame6,0.08 * mBase.Width,0.67 * mBase.Height,0.84 * mBase.Width,0.29 * mBase.Height)
	'QFrame6.Color =  0x00ffffff

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub img_click()
End Sub
Sub btnManageUser_click()
	Dim xx As ManageUsers = Starter.ManageUsers1
	xx.Visible = True
	setVisible(False)
End Sub
Sub btnLogout_click()
	Dim xx As mainPage = Starter.mainPage1
	xx.Visible = True
	setVisible(False)
End Sub
Sub QFrame4_click()
End Sub
Sub QFrame5_click()
End Sub
Sub QFrame6_click()
End Sub
Sub CreateBarsTab
	'It is not possible to draw directly on the panel that acts as the Tab page.
	'This panel doesn't have an absolute size as its size changes to fit the TabHost available size.
	'For that reason we add a panel to a panel.
'	Dim p As Panel
'	p.Initialize("")
'	pnlBars.Initialize("pnlBars")
'	p.AddView(pnlBars, 0, 0, 95%x, 100%y - 100dip)
'	TabHost1.AddTab2("Bars Chart", p)
	Dim BD As BarData
	BD.Initialize
	BD.Target = QFrame5
	BD.BarsWidth = 15dip
	BD.Stacked = False
	Charts.AddBarColor(BD, MakeTransparent(Colors.Green, 230)) 'First bar color
	Charts.AddBarColor(BD, MakeTransparent(Colors.Magenta, 230))
	Charts.AddBarColor(BD, MakeTransparent(Colors.Yellow, 230))
'	For i = 1 To 9
'		Charts.AddBarPoint(BD, 1 + i, Array As Float(Rnd(0, 100), Rnd(0, 100), Rnd(0, 100)))
'	Next
	Charts.AddBarPoint(BD, 1, Array As Float(54, 10, 15))
	Charts.AddBarPoint(BD, 2, Array As Float(60, 11, 17))
	Charts.AddBarPoint(BD, 3, Array As Float(62, 20, 17))
	Charts.AddBarPoint(BD, 4, Array As Float(58, 14, 23))
	Charts.AddBarPoint(BD, 5, Array As Float(72, 30, 43))
	Charts.AddBarPoint(BD, 6, Array As Float(84, 53, 62))
	Charts.AddBarPoint(BD, 7, Array As Float(86, 59, 68))
	Charts.AddBarPoint(BD, 8, Array As Float(99, 66, 67))
	Charts.AddBarPoint(BD, 9, Array As Float(97, 75, 89))
	Charts.AddBarPoint(BD, 10, Array As Float(99, 88, 92))
	Dim G As Graph
	G.Initialize
	G.Title = "RiDD Data Percentages"
	G.XAxis = "Number of Usage"
	G.YAxis = "Values"
	G.YStart = 0
	G.YEnd = 100
	G.YInterval = 10
	G.AxisColor = Colors.Black
	Charts.DrawBarsChart(G, BD, Colors.White)
End Sub
Sub MakeTransparent(Color As Int, Alpha As Int) As Int
	Return Bit.And(Color, Bit.Or(0x00FFFFFF, Bit.ShiftLeft(Alpha, 24)))
End Sub
Sub CreatePieTab
	'Dim p As Panel
	'p.Initialize("")
	'QFrame4.Initialize("QFrame4")
	'p.AddView(QFrame4, 0, 0, 100%x, 100%y - 100dip)
	'TabHost1.AddTab2("Pie Chart", QFrame4)
	Dim PD As PieData
	PD.Initialize
	PD.Target = QFrame4 'Set the target view
	'Add the items. The last parameter is the color. Passing 0 will make it a random color.
	Charts.AddPieItem(PD, "Healthy", 4, Colors.Green)
	Charts.AddPieItem(PD, "Colloid Goiter", 1, Colors.Magenta)
	Charts.AddPieItem(PD, "Diffused Goiter", 1, Colors.Yellow)
	'Charts.AddPieItem(PD, "Item #4", 190, 0)
	'Charts.AddPieItem(PD, "Item #5", 350, 0)
	PD.GapDegrees = 0 'Total size of gaps between slices. Set to 0 for no gaps.
	PD.LegendBackColor = Colors.ARGB(150, 100, 100, 100) 'The background color of the legend bitmap.
	Dim legend As Bitmap
	'This call draws the pie.
	'PD - The pie data
	'Colors.Gray - The view's background color
	'True - Create a legend bitmap.
	legend = Charts.DrawPie(PD, Colors.Transparent, True)
	Dim ImageView1 As ImageView
	ImageView1.Initialize("")
	ImageView1.SetBackgroundImage(legend)
	QFrame4.AddView(ImageView1, 10dip, 10dip, legend.Width, legend.Height)
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

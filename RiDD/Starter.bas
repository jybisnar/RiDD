B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=6.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region
'server
'serial
'sms
'gps

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	'Dim sms_rx As SmsInterceptor
	'Dim sms As PhoneSms
	
	
	'Dim timer1 As Timer
	'Private astream As AsyncStreams
	'Dim connected_BT As Boolean
	Dim Serial1 As Serial
	'Dim msec_ As Int'in 100 ms
	'Dim customview As List
	'Dim bluetoothview1 As Object
	'Dim frmcontrols1 As Object
	Dim wsh As WTAServer
	'Dim rp As RuntimePermissions
	'Dim frmsplash1 As Object
	'Dim frmpatient1 As Object'''
	'Dim GPS1 As GPS
	
	Dim dbsql As String="aquafeeder2.sqlite3"
	Dim ImageView1 As Object
	Dim RiDDMain1 As Object
	Dim ManageUsers1 As Object
	Dim AddUser1 As Object
	Dim riddQR1 As Object
	Dim mainPage1 As Object
	
	Dim uuid As String
	Dim FilePath As String
	Dim waiting As Boolean=False
	Dim QUERRYTABLE As clsParser
	Dim QUERRYMain As clsParser
	Dim QUERRYManageUsers As clsParser
	Dim QUERRYLatestIdd As clsParser
	'Dim statequerry As String
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Dim r As Reflector
	r.Target=r.RunStaticMethod("java.util.UUID", "randomUUID", Null, Null)
	uuid =r.RunMethod("toString")
	Serial1.Initialize("Serial1")
	wsh.Initialize(Me,"wsh","powergenAPP","powergenDEV",dbsql)
	wsh.InitWTAServer()
	QUERRYTABLE.Initialize("QUERRYTABLE",Chr(13),1)
	QUERRYMain.Initialize("QUERRYMain",Chr(13),1)
	QUERRYManageUsers.Initialize("QUERRYManageUsers",Chr(13),1)
	QUERRYLatestIdd.Initialize("QUERRYLatestIdd",Chr(13),1)
End Sub
'public Sub Println(str As String)
'	Dim x As String
'	str=str&Chr(13)
'	x=str.Length
'	If connected_BT=True Then
'		astream.Write(str.GetBytes("UTF8"))
'	End If
'End Sub
Sub sendwsh(strs As String)
	wsh.SendClient(strs & "," &uuid & "#")
End Sub
Sub wsh_NewData(data As String)
	'ToastMessageShow(data,False)
	Dim aa As Int
	For aa = 0 To data.Length-1
		Dim z As String
		z=data.SubString2(aa,aa+1)
		Dim s As ManageUsers = ManageUsers1
'		If GOTOMAP.available(z)=True Then
'			Dim track As KeyLessHome
'			track=KeyLessHome1
''			track.showportable
'		End If
		If QUERRYMain.available(z)=True Then
			Dim strsa As String=QUERRYMain.data
			'ToastMessageShow(strs,True)
			Dim a As RiDDMain = RiDDMain1
			wsh.DataGrid(a.QFrame6,strsa,"First Name, Last Name")
			waiting=False
		End If
		If QUERRYManageUsers.available(z)=True Then
			Dim strs As String=QUERRYManageUsers.data
			'ToastMessageShow(strs,True)
			'wsh.DataGrid(s.dtgUser,strs,"First Name, Last Name, IDD A, IDD B, IDD C, IDD D")
			wsh.DataGrid(s.dtgUser,strs,"First Name, Last Name, Age, Status, IDD Detected")
'			wsh.DataGrid(s.dtgIdd,strs,"First Name, Last Name, Age, Status, IDD Detected")
			waiting=False
		End If
		If QUERRYLatestIdd.available(z)=True Then
			Dim strsb As String=QUERRYLatestIdd.data
			'ToastMessageShow(strs,True)
			'Dim s As ManageUsers = ManageUsers1
			wsh.DataGrid(s.dtgIdd,strsb,"IDD Detected")
			waiting=False
		End If
	Next
End Sub
'Sub mnuDisconnect_Click
'	If connected_BT=True Then
'		astream.Close
'		timer1.Enabled=False
'		Serial1.Disconnect
'		connected_BT=False
'	End If
'End Sub
'Sub conns(res As Int, PairedDevices As Map, L As List)
'	Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)
'End Sub

'Sub Serial1_Connected (Success As Boolean)
'	If Success Then
'		ToastMessageShow("Connected successfully", False)
'		'TextReader1.Initialize(Serial1.InputStream)
'		'TextWriter1.Initialize(Serial1.OutputStream)
'		'tr.Initialize(Serial1.InputStream)
'		'tw.Initialize(Serial1.OutputStream)
'		astream.Initialize(Serial1.InputStream, Serial1.OutputStream, "astream")
'		connected_BT = True
'		'If IsPaused(Main)=False Then
'			
'		'bluetooth.Label2.Text="Connected"
'		'End If
'	Else
'		connected_BT = False
'		ToastMessageShow("Check BT connection", False)
'		'If IsPaused(Main)=False Then
'		'bluetooth.Label2.Text="DisConnected"
'		'ToastMessageShow("Check BT connection", False)
'		'End If
'		
'		'Msgbox(LastException.Message, "Error ra connecting.")
'	End If
'End Sub

'Sub astream_NewData (Buffer() As Byte)
'	Dim str As String
'	str=BytesToString(Buffer, 0, Buffer.Length, "UTF8")
'	'ToastMessageShow(str,False)
'	Dim aa As Int
'	'Dim x As frmcontrols
'	'x=frmcontrols1
'	For aa = 0 To str.Length-1
'		Dim z As String
'		z=str.SubString2(aa,aa+1)
'		
'		If myparser.available(z)=True Then
'			'Dim x As frmcontrols
'			'x=frmcontrols1
'			'x.detected.objectdetected(myparser.data)
'		End If
'	Next
'	
'End Sub
'Sub sms_rx_MessageReceived(From As String, Body As String) As Boolean
'	Dim strsend As String
'	If Body="Hello" Then
'		sms.Send(From,"what the hell")
'	End If
'	Dim aa As Int
'	For aa = 0 To Body.Length-1
'		Dim z As String
'		z=Body.SubString2(aa,aa+1)
'		If myparser.available(z)=True Then
'			ToastMessageShow(myparser.data,False)
'		End If
'	Next
'End Sub
'Sub mnuConnect_Click
'	Dim PairedDevices As Map
'	If connected_BT=False Then
'		PairedDevices = Serial1.GetPairedDevices
'		Dim L As List
'		L.Initialize
'		For i = 0 To PairedDevices.Size - 1
'			L.Add(PairedDevices.GetKeyAt(i)) 'add the friendly name to the list
'		Next
'		Dim res As Int
'		'Dim bluetooth As KeyLessBT=KeyLessBT1
'		res=""'CallSub2(bluetooth,"Getlist",L)
'		'res = InputList(L, "Choose device", -1) 'show list with paired devices ask user to choose
'		If 1 Then 'res <> DialogResponse.CANCEL Then
'			PairedDevices.Get(l.Get(res))
''			'CallSub3(Starter,"conns",res,PairedDevices,L)
''			Serial1.Connect3(PairedDevices.Get(L.Get(res)),1) 'convert the name to mac address 'mcu zigbee
''			Serial1.Connect3("C0:18:85:87:6B:2E",1)
''			Serial1.Connect3("00:1B:10:00:0C:66",1)'mcu zigbee
'			'Serial1.Connect(PairedDevices.Get(L.Get(res))) 'convert the name to mac address 'pc base
'			Serial1.Connect(PairedDevices.Get("HC-05")) 'convert the name to mac address 'pc base
'		End If
'	End If
'End Sub
'Sub Timer1_Tick
'	ToastMessageShow("saving logs to power_log.csv",True)
'	
'	If File.Exists(File.DirRootExternal, "power_log.csv")=True Then
'		Dim strs As String=vb6.GetFileStr("power_log.csv")
'		strs=strs&voltx&","&ampx&","&powerWattx&","&energyx&","&vb6.Now&Chr(13)
'		vb6.SaveFileStr("power_log.csv",strs)
'	Else
'		vb6.SaveFileStr("power_log.csv","Volt,Current,Power,Energy,Time"&Chr(13)&voltx&","&ampx&","&powerWattx&","&energyx&","&vb6.Now&Chr(13))
'	End If
'End Sub
'public Sub Println(str As String)
'	Dim x As String
'	str=str&Chr(13)
'	x=str.Length
'	If connected_BT=True Then
'		astream.Write(str.GetBytes("UTF8"))
'	End If
'End Sub
'Sub msec(xa As Int)
'	msec_ = xa
'	Do While(msec_<>0)
'		DoEvents
'	Loop
'End Sub
Sub Service_Start (StartingIntent As Intent)
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	ToastMessageShow("exit",True)
End Sub

'Sub GPS_LocationChanged (Location1 As Location)
'	Dim lat As Float= NumberFormat(Location1.Latitude, 1, 6)
'	Dim lon As Float= NumberFormat(Location1.Longitude, 1, 6)
'	Dim speed As String = "Speed = " & Location1.Speed
'	If wsh.connected=True Then
'		wsh.SendClient("WTAGPS" & lat & "," & lon & "," & speed & Chr(13))
'	End If
'	'astream_write("WTA" & lat & "," & lon & "," & speed & Chr(13))
'	
'	'If IsPaused(Main)=False Then
'	'	CallSub2(Main,"Set_edittext",lat & "," & lon & "," & speed)
'	'End If
'End Sub

'Sub GPS_UserEnabled (Enabled As Boolean)
'	ToastMessageShow("GPS device enabled = " & Enabled, True)
'End Sub
'Sub Activity_Resume
'	If GPS1.GPSEnabled = False Then
'		ToastMessageShow("Please enable the GPS device.", True)
'		StartActivity(GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
'	Else
'		GPS1.Start(0, 0) 'Listen to GPS with no filters.
'	End If
'End Sub
'Sub GPS_GpsStatus (Satellites As List)
'	'lblSatellites.Text = "Satellites:" & CRLF
'	For i = 0 To Satellites.Size - 1
'		Dim Satellite As GPSSatellite
'		'Satellite = Satellites.Get(i)
'		'lblSatellites.Text = lblSatellites.Text & CRLF & Satellite.Prn & _
'		'	" " & Satellite.Snr & " " & Satellite.UsedInFix & " " & Satellite.Azimuth _
'		'	& " " & Satellite.Elevation
'	Next
'End Sub


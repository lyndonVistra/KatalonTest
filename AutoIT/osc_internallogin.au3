WinWaitActive("","Authentication Required","10")
WinFlash("", "Authentication Required",4,500)
If WinExists("","Authentication Required") Then
  Send("HSP\svc_qa_jenkins{TAB}")
  Send("Password0{ENTER}")
ElseIf WinExists("","Chrome Legacy Window")Then
  Send("HSP\svc_qa_jenkins{TAB}")
  Send("Password0{ENTER}")
ElseIf WinExists("","Windows Security") Then
  Send("HSP\svc_qa_jenkins{TAB}")
  Send("Password0{ENTER}")
EndIf
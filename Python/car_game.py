
start_flag = True
stop_flag = True

while(True):
    cmd = input(">")

    if cmd.lower() == 'start' and start_flag == True:
        print("Car Started... Ready to go")
        start_flag = False
        stop_flag = True
    elif cmd.lower() == 'stop' and stop_flag == True:
        print("Car Stopped.")
        stop_flag = False
        start_flag = True
    elif cmd.lower() == 'quit':
        break
    elif cmd.lower() == 'help':
        print("start - to start the car")
        print("stop - to stop the car")
        print("quit - to exit")
    elif cmd.lower() == 'start' and start_flag == False:
        print("Car is already Start")
    elif cmd.lower() == 'stop' and stop_flag == False:
        print("Car is already Stop")

    else:
        print("I Dont understand that")

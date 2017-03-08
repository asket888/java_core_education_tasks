:: Beginning of hub batch file
set SERVER_VERSION=3.0.1
set TASK_NAME=SeleniumServerNode3
set HUB_PORT=5558
set REGISTER_IP=localhost:4444
set OPERA_DRIVER=d:\webdriver\operadriver.exe
java -jar -Dwebdriver.opera.driver=%OPERA_DRIVER% selenium-server-standalone-%SERVER_VERSION%.jar -role node -hub http://%REGISTER_IP%/grid/register -browser browserName=opera,platform=WINDOWS -port %HUB_PORT%
:: End of hub batch file
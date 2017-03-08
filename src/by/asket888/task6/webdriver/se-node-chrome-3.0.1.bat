:: Beginning of hub batch file
set SERVER_VERSION=3.0.1
set TASK_NAME=SeleniumServerNode3
set HUB_PORT=5556
set REGISTER_IP=localhost:4444
set CHROME_DRIVER=d:\webdriver\chromedriver.exe
java -Dwebdriver.chrome.driver=%CHROME_DRIVER% -jar selenium-server-standalone-%SERVER_VERSION%.jar -role node -hub http://%REGISTER_IP%/grid/register -browser "browserName=chrome,version=55,maxinstance=5,platform=WINDOWS" -port %HUB_PORT%
:: End of hub batch file
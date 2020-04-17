# nohup java -jar eladmin-system-2.4.jar --spring.profiles.active=prod &
nohup java -jar -Xms64m -Xmx128m ruoyi.jar --spring.profiles.active=prod > /opt/zhyq/nohup.txt 2>&1 &
package ru.shab.singleton;

public class ProgramLogger {
	private static ProgramLogger programLogger;//создали экземпляр
	private static String logFile = "This is log file. \n\n";//вместо файла будет строка
	
	public static synchronized ProgramLogger getProgramLogger() {//метод, который возвращает экземпляр ProgramLogger
		if(programLogger == null) {//synchronized - для многопоточных систем, что только один поток мог работать с классом в тек.время
			programLogger = new ProgramLogger();
		}
		
		return programLogger;
	}
	
	private ProgramLogger() {};
	
	public void addLogInfo(String logInfo) {//та инф-я, которую хотим занести в логфайл
		logFile += logInfo + "\n";
	}
	
	public void showLogFile() {//метод для отображения логфайла
		System.out.println(logFile);
	}
}

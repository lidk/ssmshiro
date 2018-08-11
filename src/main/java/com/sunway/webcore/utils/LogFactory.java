package com.sunway.webcore.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class LogFactory {
	private LogFactory() {
	}

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void start(String Jobuuid) {
		// 为false时，返回多个LoggerContext对象， true：返回唯一的单例LoggerContext
		final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		final Configuration config = ctx.getConfiguration();
		// 创建一个展示的样式：PatternLayout， 还有其他的日志打印样式。
		// Layout layout =
		// PatternLayout.createLayout(PatternLayout.DEFAULT_CONVERSION_PATTERN,
		// config, null, null, true,
		// false, null, null);
		System.out.println(config);
		Layout layout = PatternLayout.createLayout(PatternLayout.DEFAULT_CONVERSION_PATTERN, null, config, null, null,
				true, false, null, null);
		System.out.println(layout.toString());
		System.out.println(layout.getFooter());
		// TriggeringPolicy tp = SizeBasedTriggeringPolicy.createPolicy("10MB");
		// Appender appender =
		// RollingFileAppender.createAppender(String.format("
		// logs/test/syncshows-job-%s.log", jobID),
		// "/logs/test/" + jobID + "/syncshows-job-" + jobID + ".log.gz",
		// "true", jobID, null, null, null, tp, null, layout, null,
		// null, null, null, config);
		// 日志打印方式——输出为文件
		DateTime dt = new DateTime();
		String dateStinrg = dt.toString("yyyy-MM-dd");
		//wait add user name
		Appender appender = FileAppender.createAppender(String.format("D:/logs/%s/%s.log", dateStinrg, Jobuuid), "true",
				"false",Jobuuid, null, "true", "true", null, layout, null, null, null, config);
		appender.start();
		config.addAppender(appender);
		AppenderRef ref = AppenderRef.createAppenderRef(Jobuuid, null, null);
		AppenderRef[] refs = new AppenderRef[] { ref };
		LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.ERROR, Jobuuid, "true", refs, null,
				config, null);
		loggerConfig.addAppender(appender, null, null);
		config.addLogger(Jobuuid, loggerConfig);
		ctx.updateLoggers();
	}

	public static void stop(String Jobuuid) {
		final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		final Configuration config = ctx.getConfiguration();
		config.getAppender(Jobuuid).stop();
		config.getLoggerConfig(Jobuuid).removeAppender(Jobuuid);
		config.removeLogger(Jobuuid);
		ctx.updateLoggers();
	}

	/**
	 * 获取Logger
	 *
	 * 如果不想使用slf4j,那这里改成直接返回Log4j的Logger即可
	 * 
	 * @param jobId
	 * @return
	 */
	public static Logger createLogger(String Jobuuid) {
		start(Jobuuid);
		return LoggerFactory.getLogger(Jobuuid);
	}
}
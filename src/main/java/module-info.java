module org.cryptomator.webdav.servlet {
	exports org.cryptomator.webdav.core.filters;
	exports org.cryptomator.webdav.core.servlet;

	requires javax.servlet.api;
	requires java.xml;
	requires org.slf4j;
	requires com.google.common;
	requires jackrabbit.webdav;
}
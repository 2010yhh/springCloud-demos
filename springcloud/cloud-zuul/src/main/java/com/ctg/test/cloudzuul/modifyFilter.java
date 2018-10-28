//package com.ctg.test.cloudzuul;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.http.ServletInputStreamWrapper;
//import org.apache.commons.codec.binary.Base64;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StreamUtils;
//
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.charset.Charset;
//
//import static com.netflix.zuul.context.RequestContext.getCurrentContext;
//import static org.springframework.util.ReflectionUtils.rethrowRuntimeException;
//
///**
// * @Description: TODO
// * @Author: yanhonghai
// * @Date: 2018/10/10 11:42
// */
//@Component
//public class modifyFilter  extends ZuulFilter {
//    private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);
//
//    @Override
//    public String filterType() {
//        return FilterConstants.PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        try {
//            RequestContext context = getCurrentContext();
//            InputStream in = (InputStream) context.get("requestEntity");
//            if (in == null) {
//                in = context.getRequest().getInputStream();
//            }
//            String body = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
//            body = "动态增加一段内容到body中: " + body;
//            byte[] bytes = body.getBytes("UTF-8");
//            context.setRequest(new HttpServletRequestWrapper(getCurrentContext().getRequest()) {
//                @Override
//                public ServletInputStream getInputStream() throws IOException {
//                    return new ServletInputStreamWrapper(bytes);
//                }
//
//                @Override
//                public int getContentLength() {
//                    return bytes.length;
//                }
//
//                @Override
//                public long getContentLengthLong() {
//                    return bytes.length;
//                }
//            });
//        } catch (IOException e) {
//            rethrowRuntimeException(e);
//        }
//        return null;
//    }
//
//}

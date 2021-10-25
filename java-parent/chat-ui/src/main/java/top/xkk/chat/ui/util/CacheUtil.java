package top.xkk.chat.ui.util;

import top.xkk.chat.ui.view.chat.element.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存工具
 * @author mqxu
 */
public class CacheUtil {

    /**
     * 对话框组
     */
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);

}

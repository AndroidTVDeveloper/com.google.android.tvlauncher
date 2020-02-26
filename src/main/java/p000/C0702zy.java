package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zy */
/* compiled from: PG */
public final class C0702zy {

    /* renamed from: b */
    private static final String f10869b;

    /* renamed from: c */
    private static final Map f10870c;

    /* renamed from: a */
    public final Map f10871a = f10870c;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        f10869b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(f10869b)) {
            hashMap.put("User-Agent", Collections.singletonList(new C0703zz(f10869b)));
        }
        f10870c = Collections.unmodifiableMap(hashMap);
    }
}

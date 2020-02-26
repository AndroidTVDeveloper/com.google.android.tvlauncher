package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zy  reason: default package */
/* compiled from: PG */
public final class zy {
    private static final String b;
    private static final Map c;
    public final Map a = c;

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
        b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("User-Agent", Collections.singletonList(new zz(b)));
        }
        c = Collections.unmodifiableMap(hashMap);
    }
}

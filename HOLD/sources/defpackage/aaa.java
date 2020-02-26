package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aaa  reason: default package */
/* compiled from: PG */
public final class aaa implements zw {
    private final Map b;
    private volatile Map c;

    public aaa(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaa) {
            return this.b.equals(((aaa) obj).b);
        }
        return false;
    }

    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : this.b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String a = ((zx) list.get(i)).a();
                            if (!TextUtils.isEmpty(a)) {
                                sb.append(a);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    this.c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}

package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aaa */
/* compiled from: PG */
public final class aaa implements C0700zw {

    /* renamed from: b */
    private final Map f2b;

    /* renamed from: c */
    private volatile Map f3c;

    public aaa(Map map) {
        this.f2b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaa) {
            return this.f2b.equals(((aaa) obj).f2b);
        }
        return false;
    }

    /* renamed from: a */
    public final Map mo1a() {
        if (this.f3c == null) {
            synchronized (this) {
                if (this.f3c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : this.f2b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String a = ((C0701zx) list.get(i)).mo6160a();
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
                    this.f3c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.f3c;
    }

    public final int hashCode() {
        return this.f2b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}

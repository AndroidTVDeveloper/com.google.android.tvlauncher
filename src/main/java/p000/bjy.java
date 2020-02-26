package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bjy */
/* compiled from: PG */
public final class bjy implements bjw {

    /* renamed from: a */
    public static final bjy f4181a = new bjy(Collections.emptyMap());

    /* renamed from: b */
    public final Map f4182b;

    /* renamed from: c */
    private int f4183c;

    public bjy() {
        this(Collections.emptyMap());
    }

    public bjy(Map map) {
        this.f4182b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final bjy mo2019a(bjx bjx) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f4182b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(bjx.f4180b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(bjx.f4179a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        for (String str : unmodifiableMap.keySet()) {
            Object obj = unmodifiableMap.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        if (!m3450a(this.f4182b, hashMap)) {
            return new bjy(hashMap);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m3450a(this.f4182b, ((bjy) obj).f4182b);
    }

    /* renamed from: a */
    public final long mo2016a(String str) {
        if (this.f4182b.containsKey(str)) {
            return ByteBuffer.wrap((byte[]) this.f4182b.get(str)).getLong();
        }
        return -1;
    }

    /* renamed from: b */
    public final String mo2017b(String str) {
        if (this.f4182b.containsKey(str)) {
            return new String((byte[]) this.f4182b.get(str), Charset.forName("UTF-8"));
        }
        return null;
    }

    public final int hashCode() {
        int i = this.f4183c;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry entry : this.f4182b.entrySet()) {
            i2 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
        }
        this.f4183c = i2;
        return i2;
    }

    /* renamed from: a */
    private static boolean m3450a(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}

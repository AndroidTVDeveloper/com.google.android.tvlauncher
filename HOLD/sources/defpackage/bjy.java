package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bjy  reason: default package */
/* compiled from: PG */
public final class bjy implements bjw {
    public static final bjy a = new bjy(Collections.emptyMap());
    public final Map b;
    private int c;

    public bjy() {
        this(Collections.emptyMap());
    }

    public bjy(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final bjy a(bjx bjx) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(bjx.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(bjx.a);
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
        if (!a(this.b, hashMap)) {
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
        return a(this.b, ((bjy) obj).b);
    }

    public final long a(String str) {
        if (this.b.containsKey(str)) {
            return ByteBuffer.wrap((byte[]) this.b.get(str)).getLong();
        }
        return -1;
    }

    public final String b(String str) {
        if (this.b.containsKey(str)) {
            return new String((byte[]) this.b.get(str), Charset.forName("UTF-8"));
        }
        return null;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i2 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
        }
        this.c = i2;
        return i2;
    }

    private static boolean a(Map map, Map map2) {
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

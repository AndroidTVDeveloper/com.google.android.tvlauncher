package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aul */
/* compiled from: PG */
public final class aul implements atv {
    public static final Parcelable.Creator CREATOR = new auk();

    /* renamed from: a */
    public final int f2448a;

    /* renamed from: b */
    public final int f2449b;

    /* renamed from: c */
    private final String f2450c;

    /* renamed from: d */
    private final String f2451d;

    /* renamed from: e */
    private final String f2452e;

    /* renamed from: f */
    private final boolean f2453f;

    /* renamed from: a */
    public final akh mo1253a() {
        return null;
    }

    /* renamed from: b */
    public final byte[] mo1254b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    private aul(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        bks.m3510a(z2);
        this.f2448a = i;
        this.f2450c = str;
        this.f2451d = str2;
        this.f2452e = str3;
        this.f2453f = z;
        this.f2449b = i2;
    }

    public aul(Parcel parcel) {
        this.f2448a = parcel.readInt();
        this.f2450c = parcel.readString();
        this.f2451d = parcel.readString();
        this.f2452e = parcel.readString();
        this.f2453f = blm.m3650a(parcel);
        this.f2449b = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aul aul = (aul) obj;
        return this.f2448a == aul.f2448a && blm.m3652a(this.f2450c, aul.f2450c) && blm.m3652a(this.f2451d, aul.f2451d) && blm.m3652a(this.f2452e, aul.f2452e) && this.f2453f == aul.f2453f && this.f2449b == aul.f2449b;
    }

    public final int hashCode() {
        int i = (this.f2448a + 527) * 31;
        String str = this.f2450c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2451d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2452e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f2453f ? 1 : 0)) * 31) + this.f2449b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.aul m2169a(java.util.Map r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = 1
            r4 = -1
            r5 = 0
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0041 }
            int r6 = r6 * 1000
            if (r6 > 0) goto L_0x003d
            java.lang.String r7 = "Invalid bitrate: "
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x003b }
            int r9 = r8.length()     // Catch:{ NumberFormatException -> 0x003b }
            if (r9 != 0) goto L_0x0031
            java.lang.String r8 = new java.lang.String     // Catch:{ NumberFormatException -> 0x003b }
            r8.<init>(r7)     // Catch:{ NumberFormatException -> 0x003b }
            goto L_0x0035
        L_0x0031:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ NumberFormatException -> 0x003b }
        L_0x0035:
            android.util.Log.w(r2, r8)     // Catch:{ NumberFormatException -> 0x003b }
            r1 = 0
            r6 = -1
            goto L_0x003f
        L_0x003b:
            r7 = move-exception
            goto L_0x0043
        L_0x003d:
            r1 = 1
        L_0x003f:
            r7 = r6
            goto L_0x0062
        L_0x0041:
            r6 = move-exception
            r6 = -1
        L_0x0043:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r7 = "Invalid bitrate header: "
            int r8 = r1.length()
            if (r8 != 0) goto L_0x0055
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            goto L_0x0059
        L_0x0055:
            java.lang.String r1 = r7.concat(r1)
        L_0x0059:
            android.util.Log.w(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0062
        L_0x0060:
            r1 = 0
            r7 = -1
        L_0x0062:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0077
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0079
        L_0x0077:
            r9 = r8
        L_0x0079:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008c
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x008e
        L_0x008c:
            r10 = r8
        L_0x008e:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a1
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x00a3
        L_0x00a1:
            r11 = r8
        L_0x00a3:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00bc
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00be
        L_0x00bc:
            r12 = 0
        L_0x00be:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x010d
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00f3 }
            if (r5 > 0) goto L_0x00ef
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00ec }
            int r6 = r3.length()     // Catch:{ NumberFormatException -> 0x00ec }
            if (r6 != 0) goto L_0x00e4
            java.lang.String r3 = new java.lang.String     // Catch:{ NumberFormatException -> 0x00ec }
            r3.<init>(r0)     // Catch:{ NumberFormatException -> 0x00ec }
            goto L_0x00e8
        L_0x00e4:
            java.lang.String r3 = r0.concat(r3)     // Catch:{ NumberFormatException -> 0x00ec }
        L_0x00e8:
            android.util.Log.w(r2, r3)     // Catch:{ NumberFormatException -> 0x00ec }
            goto L_0x010d
        L_0x00ec:
            r3 = move-exception
            r4 = r5
            goto L_0x00f4
        L_0x00ef:
            r4 = r5
            r1 = 1
            goto L_0x010d
        L_0x00f3:
            r3 = move-exception
        L_0x00f4:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r3 = r13.length()
            if (r3 != 0) goto L_0x0104
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
            goto L_0x0108
        L_0x0104:
            java.lang.String r13 = r0.concat(r13)
        L_0x0108:
            android.util.Log.w(r2, r13)
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            if (r1 == 0) goto L_0x011c
            aul r13 = new aul
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r13
        L_0x011c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aul.m2169a(java.util.Map):aul");
    }

    public final String toString() {
        String str = this.f2451d;
        String str2 = this.f2450c;
        int i = this.f2448a;
        int i2 = this.f2449b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2448a);
        parcel.writeString(this.f2450c);
        parcel.writeString(this.f2451d);
        parcel.writeString(this.f2452e);
        blm.m3643a(parcel, this.f2453f);
        parcel.writeInt(this.f2449b);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aue  reason: default package */
/* compiled from: PG */
public final class aue implements atv {
    public static final Parcelable.Creator CREATOR = new aud();
    private static final akh f = akh.a(null, "application/id3", Long.MAX_VALUE);
    private static final akh g = akh.a(null, "application/x-scte35", Long.MAX_VALUE);
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akh a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            akh r0 = defpackage.aue.g
            return r0
        L_0x0042:
            akh r0 = defpackage.aue.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aue.a():akh");
    }

    public final int describeContents() {
        return 0;
    }

    public aue(Parcel parcel) {
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = (String) blm.a((Object) parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) blm.a((Object) parcel.createByteArray());
    }

    public aue(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aue aue = (aue) obj;
        return this.c == aue.c && this.d == aue.d && blm.a(this.a, aue.a) && blm.a(this.b, aue.b) && Arrays.equals(this.e, aue.e);
    }

    public final byte[] b() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.c;
        long j2 = this.d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.e);
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.a;
        long j = this.d;
        long j2 = this.c;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}

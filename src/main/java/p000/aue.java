package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aue */
/* compiled from: PG */
public final class aue implements atv {
    public static final Parcelable.Creator CREATOR = new aud();

    /* renamed from: f */
    private static final akh f2429f = akh.m735a(null, "application/id3", Long.MAX_VALUE);

    /* renamed from: g */
    private static final akh f2430g = akh.m735a(null, "application/x-scte35", Long.MAX_VALUE);

    /* renamed from: a */
    public final String f2431a;

    /* renamed from: b */
    public final String f2432b;

    /* renamed from: c */
    public final long f2433c;

    /* renamed from: d */
    public final long f2434d;

    /* renamed from: e */
    public final byte[] f2435e;

    /* renamed from: h */
    private int f2436h;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.akh mo1253a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f2431a
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
            akh r0 = p000.aue.f2430g
            return r0
        L_0x0042:
            akh r0 = p000.aue.f2429f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aue.mo1253a():akh");
    }

    public final int describeContents() {
        return 0;
    }

    public aue(Parcel parcel) {
        this.f2431a = (String) blm.m3636a((Object) parcel.readString());
        this.f2432b = (String) blm.m3636a((Object) parcel.readString());
        this.f2433c = parcel.readLong();
        this.f2434d = parcel.readLong();
        this.f2435e = (byte[]) blm.m3636a((Object) parcel.createByteArray());
    }

    public aue(String str, String str2, long j, long j2, byte[] bArr) {
        this.f2431a = str;
        this.f2432b = str2;
        this.f2433c = j;
        this.f2434d = j2;
        this.f2435e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aue aue = (aue) obj;
        return this.f2433c == aue.f2433c && this.f2434d == aue.f2434d && blm.m3652a(this.f2431a, aue.f2431a) && blm.m3652a(this.f2432b, aue.f2432b) && Arrays.equals(this.f2435e, aue.f2435e);
    }

    /* renamed from: b */
    public final byte[] mo1254b() {
        if (mo1253a() != null) {
            return this.f2435e;
        }
        return null;
    }

    public final int hashCode() {
        int i = this.f2436h;
        if (i != 0) {
            return i;
        }
        String str = this.f2431a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f2432b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f2433c;
        long j2 = this.f2434d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f2435e);
        this.f2436h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f2431a;
        long j = this.f2434d;
        long j2 = this.f2433c;
        String str2 = this.f2432b;
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
        parcel.writeString(this.f2431a);
        parcel.writeString(this.f2432b);
        parcel.writeLong(this.f2433c);
        parcel.writeLong(this.f2434d);
        parcel.writeByteArray(this.f2435e);
    }
}

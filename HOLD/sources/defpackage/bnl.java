package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnl  reason: default package */
/* compiled from: PG */
public final class bnl extends buf {
    public static final Parcelable.Creator CREATOR = new bnm();
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final boolean f;
    private final String g;
    private final boolean h;
    private final int i;
    private final Integer j;

    public bnl(String str, int i2, int i3, String str2, int i4) {
        this.a = (String) buh.a((Object) str);
        this.b = i2;
        this.c = i3;
        this.g = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.h = false;
        int i5 = i4 - 1;
        if (i4 != 0) {
            this.i = i5;
            this.j = null;
            return;
        }
        throw null;
    }

    public bnl(String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4, Integer num) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i4;
        this.j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bnl) {
            bnl bnl = (bnl) obj;
            return bty.a(this.a, bnl.a) && this.b == bnl.b && this.c == bnl.c && bty.a(this.g, bnl.g) && bty.a(this.d, bnl.d) && bty.a(this.e, bnl.e) && this.f == bnl.f && this.h == bnl.h && this.i == bnl.i && this.j == bnl.j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.g + ",uploadAccount=" + this.d + ",loggingId=" + this.e + ",logAndroidId=" + this.f + ",isAnonymous=" + this.h + ",qosTier=" + this.i + ",appMobilespecId=" + this.j + "]";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.a);
        buj.b(parcel, 3, this.b);
        buj.b(parcel, 4, this.c);
        buj.a(parcel, 5, this.d);
        buj.a(parcel, 6, this.e);
        buj.a(parcel, 7, this.f);
        buj.a(parcel, 8, this.g);
        buj.a(parcel, 9, this.h);
        buj.b(parcel, 10, this.i);
        Integer num = this.j;
        if (num != null) {
            buj.a(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        buj.b(parcel, a2);
    }
}

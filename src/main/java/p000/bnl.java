package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bnl */
/* compiled from: PG */
public final class bnl extends buf {
    public static final Parcelable.Creator CREATOR = new bnm();

    /* renamed from: a */
    private final String f4469a;

    /* renamed from: b */
    private final int f4470b;

    /* renamed from: c */
    private final int f4471c;

    /* renamed from: d */
    private final String f4472d;

    /* renamed from: e */
    private final String f4473e;

    /* renamed from: f */
    private final boolean f4474f;

    /* renamed from: g */
    private final String f4475g;

    /* renamed from: h */
    private final boolean f4476h;

    /* renamed from: i */
    private final int f4477i;

    /* renamed from: j */
    private final Integer f4478j;

    public bnl(String str, int i, int i2, String str2, int i3) {
        this.f4469a = (String) buh.m4199a((Object) str);
        this.f4470b = i;
        this.f4471c = i2;
        this.f4475g = str2;
        this.f4472d = null;
        this.f4473e = null;
        this.f4474f = true;
        this.f4476h = false;
        int i4 = i3 - 1;
        if (i3 != 0) {
            this.f4477i = i4;
            this.f4478j = null;
            return;
        }
        throw null;
    }

    public bnl(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3, Integer num) {
        this.f4469a = str;
        this.f4470b = i;
        this.f4471c = i2;
        this.f4472d = str2;
        this.f4473e = str3;
        this.f4474f = z;
        this.f4475g = str4;
        this.f4476h = z2;
        this.f4477i = i3;
        this.f4478j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bnl) {
            bnl bnl = (bnl) obj;
            return bty.m4184a(this.f4469a, bnl.f4469a) && this.f4470b == bnl.f4470b && this.f4471c == bnl.f4471c && bty.m4184a(this.f4475g, bnl.f4475g) && bty.m4184a(this.f4472d, bnl.f4472d) && bty.m4184a(this.f4473e, bnl.f4473e) && this.f4474f == bnl.f4474f && this.f4476h == bnl.f4476h && this.f4477i == bnl.f4477i && this.f4478j == bnl.f4478j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4469a, Integer.valueOf(this.f4470b), Integer.valueOf(this.f4471c), this.f4475g, this.f4472d, this.f4473e, Boolean.valueOf(this.f4474f), Boolean.valueOf(this.f4476h), Integer.valueOf(this.f4477i), this.f4478j});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f4469a + ",packageVersionCode=" + this.f4470b + ",logSource=" + this.f4471c + ",logSourceName=" + this.f4475g + ",uploadAccount=" + this.f4472d + ",loggingId=" + this.f4473e + ",logAndroidId=" + this.f4474f + ",isAnonymous=" + this.f4476h + ",qosTier=" + this.f4477i + ",appMobilespecId=" + this.f4478j + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4239a(parcel, 2, this.f4469a);
        buj.m4251b(parcel, 3, this.f4470b);
        buj.m4251b(parcel, 4, this.f4471c);
        buj.m4239a(parcel, 5, this.f4472d);
        buj.m4239a(parcel, 6, this.f4473e);
        buj.m4241a(parcel, 7, this.f4474f);
        buj.m4239a(parcel, 8, this.f4475g);
        buj.m4241a(parcel, 9, this.f4476h);
        buj.m4251b(parcel, 10, this.f4477i);
        Integer num = this.f4478j;
        if (num != null) {
            buj.m4234a(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        buj.m4250b(parcel, a);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bbw  reason: default package */
/* compiled from: PG */
public final class bbw implements atv {
    public static final Parcelable.Creator CREATOR = new bbt();
    public final List a;
    private final String b;
    private final String c;

    public final akh a() {
        return null;
    }

    public final byte[] b() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public bbw(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((bbv) parcel.readParcelable(bbv.class.getClassLoader()));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public bbw(String str, String str2, List list) {
        this.b = str;
        this.c = str2;
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bbw bbw = (bbw) obj;
        return TextUtils.equals(this.b, bbw.b) && TextUtils.equals(this.c, bbw.c) && this.a.equals(bbw.a);
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.b;
        if (str2 != null) {
            String str3 = this.c;
            StringBuilder sb = new StringBuilder(str2.length() + 5 + String.valueOf(str3).length());
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("HlsTrackMetadataEntry") : "HlsTrackMetadataEntry".concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.a.get(i2), 0);
        }
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bbw */
/* compiled from: PG */
public final class bbw implements atv {
    public static final Parcelable.Creator CREATOR = new bbt();

    /* renamed from: a */
    public final List f3193a;

    /* renamed from: b */
    private final String f3194b;

    /* renamed from: c */
    private final String f3195c;

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

    public bbw(Parcel parcel) {
        this.f3194b = parcel.readString();
        this.f3195c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((bbv) parcel.readParcelable(bbv.class.getClassLoader()));
        }
        this.f3193a = Collections.unmodifiableList(arrayList);
    }

    public bbw(String str, String str2, List list) {
        this.f3194b = str;
        this.f3195c = str2;
        this.f3193a = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bbw bbw = (bbw) obj;
        return TextUtils.equals(this.f3194b, bbw.f3194b) && TextUtils.equals(this.f3195c, bbw.f3195c) && this.f3193a.equals(bbw.f3193a);
    }

    public final int hashCode() {
        String str = this.f3194b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3195c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f3193a.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f3194b;
        if (str2 != null) {
            String str3 = this.f3195c;
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
        parcel.writeString(this.f3194b);
        parcel.writeString(this.f3195c);
        int size = this.f3193a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.f3193a.get(i2), 0);
        }
    }
}

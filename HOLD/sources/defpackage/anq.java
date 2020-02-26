package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: anq  reason: default package */
/* compiled from: PG */
public final class anq implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new ann();
    public final String a;
    private final anp[] b;
    private int c;

    public final int describeContents() {
        return 0;
    }

    public anq(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (anp[]) blm.a((Object) ((anp[]) parcel.createTypedArray(anp.CREATOR)));
    }

    public anq(String str, List list) {
        this(str, false, (anp[]) list.toArray(new anp[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: anp[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private anq(java.lang.String r1, boolean r2, defpackage.anp... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 == 0) goto L_0x000f
            java.lang.Object r1 = r3.clone()
            r3 = r1
            anp[] r3 = (defpackage.anp[]) r3
            goto L_0x0010
        L_0x000f:
        L_0x0010:
            r0.b = r3
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anq.<init>(java.lang.String, boolean, anp[]):void");
    }

    public anq(String str, anp... anpArr) {
        this(str, true, anpArr);
    }

    public anq(List list) {
        this(null, false, (anp[]) list.toArray(new anp[0]));
    }

    public anq(anp... anpArr) {
        this((String) null, anpArr);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        anp anp = (anp) obj;
        anp anp2 = (anp) obj2;
        if (!aja.a.equals(anp.a)) {
            return anp.a.compareTo(anp2.a);
        }
        if (!aja.a.equals(anp2.a)) {
            return 1;
        }
        return 0;
    }

    public final anq a(String str) {
        return !blm.a(this.a, str) ? new anq(str, false, this.b) : this;
    }

    public static anq a(anq anq, anq anq2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (anq != null) {
            str = anq.a;
            for (anp anp : anq.b) {
                if (anp.a()) {
                    arrayList.add(anp);
                }
            }
        } else {
            str = null;
        }
        if (anq2 != null) {
            if (str == null) {
                str = anq2.a;
            }
            int size = arrayList.size();
            for (anp anp2 : anq2.b) {
                if (anp2.a()) {
                    UUID uuid = anp2.a;
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (((anp) arrayList.get(i)).a.equals(uuid)) {
                                break;
                            }
                            i++;
                        } else {
                            arrayList.add(anp2);
                            break;
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return new anq(str, arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        anq anq = (anq) obj;
        return blm.a(this.a, anq.a) && Arrays.equals(this.b, anq.b);
    }

    public final int hashCode() {
        int i;
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.b, 0);
    }
}

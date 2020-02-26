package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: anq */
/* compiled from: PG */
public final class anq implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new ann();

    /* renamed from: a */
    public final String f1450a;

    /* renamed from: b */
    private final anp[] f1451b;

    /* renamed from: c */
    private int f1452c;

    public final int describeContents() {
        return 0;
    }

    public anq(Parcel parcel) {
        this.f1450a = parcel.readString();
        this.f1451b = (anp[]) blm.m3636a((Object) ((anp[]) parcel.createTypedArray(anp.CREATOR)));
    }

    public anq(String str, List list) {
        this(str, false, (anp[]) list.toArray(new anp[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: anp[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private anq(java.lang.String r1, boolean r2, p000.anp... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f1450a = r1
            if (r2 == 0) goto L_0x000f
            java.lang.Object r1 = r3.clone()
            r3 = r1
            anp[] r3 = (p000.anp[]) r3
            goto L_0x0010
        L_0x000f:
        L_0x0010:
            r0.f1451b = r3
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.anq.<init>(java.lang.String, boolean, anp[]):void");
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
        if (!aja.f429a.equals(anp.f1445a)) {
            return anp.f1445a.compareTo(anp2.f1445a);
        }
        if (!aja.f429a.equals(anp2.f1445a)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final anq mo1168a(String str) {
        return !blm.m3652a(this.f1450a, str) ? new anq(str, false, this.f1451b) : this;
    }

    /* renamed from: a */
    public static anq m1597a(anq anq, anq anq2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (anq != null) {
            str = anq.f1450a;
            for (anp anp : anq.f1451b) {
                if (anp.mo1163a()) {
                    arrayList.add(anp);
                }
            }
        } else {
            str = null;
        }
        if (anq2 != null) {
            if (str == null) {
                str = anq2.f1450a;
            }
            int size = arrayList.size();
            for (anp anp2 : anq2.f1451b) {
                if (anp2.mo1163a()) {
                    UUID uuid = anp2.f1445a;
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (((anp) arrayList.get(i)).f1445a.equals(uuid)) {
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
        return blm.m3652a(this.f1450a, anq.f1450a) && Arrays.equals(this.f1451b, anq.f1451b);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f1452c;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f1450a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f1451b);
        this.f1452c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1450a);
        parcel.writeTypedArray(this.f1451b, 0);
    }
}

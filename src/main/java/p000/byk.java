package p000;

import android.content.ContentResolver;

/* renamed from: byk */
/* compiled from: PG */
final class byk extends byl {
    public byk(String str, Integer num) {
        super(str, num);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2541a() {
        int i;
        ContentResolver contentResolver = byl.f5017a;
        String str = this.f5018b;
        int intValue = ((Integer) this.f5019c).intValue();
        Object a = byi.m4365a(contentResolver);
        Integer num = (Integer) byi.m4366a(byi.f5008e, str, Integer.valueOf(intValue));
        if (num != null) {
            i = num.intValue();
        } else {
            String a2 = byi.m4367a(contentResolver, str);
            if (a2 != null) {
                try {
                    int parseInt = Integer.parseInt(a2);
                    num = Integer.valueOf(parseInt);
                    intValue = parseInt;
                } catch (NumberFormatException e) {
                    i = intValue;
                }
            }
            i = intValue;
            byi.m4370a(a, byi.f5008e, str, num);
        }
        return Integer.valueOf(i);
    }
}

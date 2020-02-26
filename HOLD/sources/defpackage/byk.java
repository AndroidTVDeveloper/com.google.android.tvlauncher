package defpackage;

import android.content.ContentResolver;

/* renamed from: byk  reason: default package */
/* compiled from: PG */
final class byk extends byl {
    public byk(String str, Integer num) {
        super(str, num);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        int i;
        ContentResolver contentResolver = byl.a;
        String str = this.b;
        int intValue = ((Integer) this.c).intValue();
        Object a = byi.a(contentResolver);
        Integer num = (Integer) byi.a(byi.e, str, Integer.valueOf(intValue));
        if (num != null) {
            i = num.intValue();
        } else {
            String a2 = byi.a(contentResolver, str);
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
            byi.a(a, byi.e, str, num);
        }
        return Integer.valueOf(i);
    }
}

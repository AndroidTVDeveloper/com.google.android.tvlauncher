package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bcf  reason: default package */
/* compiled from: PG */
public final class bcf extends bci {
    public static final bcf a = new bcf("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final akh f;
    public final List g;
    public final Map h;

    public bcf(String str, List list, List list2, List list3, List list4, List list5, List list6, akh akh, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((bce) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        a(list6, arrayList);
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.e = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f = akh;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.g = list9;
        this.h = Collections.unmodifiableMap(map);
        Collections.unmodifiableList(list8);
    }

    private static void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((bcd) list.get(i)).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static bcf a(String str) {
        return new bcf("", Collections.emptyList(), Collections.singletonList(new bce(Uri.parse(str), akh.a("0", (String) null, "application/x-mpegURL", (String) null, (String) null, -1, 0, 0, (String) null), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
}

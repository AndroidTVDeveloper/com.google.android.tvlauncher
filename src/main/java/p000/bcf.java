package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bcf */
/* compiled from: PG */
public final class bcf extends bci {

    /* renamed from: a */
    public static final bcf f3242a = new bcf("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: b */
    public final List f3243b;

    /* renamed from: c */
    public final List f3244c;

    /* renamed from: d */
    public final List f3245d;

    /* renamed from: e */
    public final List f3246e;

    /* renamed from: f */
    public final akh f3247f;

    /* renamed from: g */
    public final List f3248g;

    /* renamed from: h */
    public final Map f3249h;

    public bcf(String str, List list, List list2, List list3, List list4, List list5, List list6, akh akh, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((bce) list2.get(i)).f3236a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m2800a(list3, arrayList);
        m2800a(list4, arrayList);
        m2800a(list5, arrayList);
        m2800a(list6, arrayList);
        this.f3243b = Collections.unmodifiableList(arrayList);
        this.f3244c = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f3245d = Collections.unmodifiableList(list4);
        this.f3246e = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f3247f = akh;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f3248g = list9;
        this.f3249h = Collections.unmodifiableMap(map);
        Collections.unmodifiableList(list8);
    }

    /* renamed from: a */
    private static void m2800a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((bcd) list.get(i)).f3233a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: a */
    public static bcf m2799a(String str) {
        return new bcf("", Collections.emptyList(), Collections.singletonList(new bce(Uri.parse(str), akh.m740a("0", (String) null, "application/x-mpegURL", (String) null, (String) null, -1, 0, 0, (String) null), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
}

package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* renamed from: sl */
/* compiled from: PG */
public final class C0500sl extends ContextWrapper {

    /* renamed from: a */
    public static final C0513sy f10382a = new C0513sy((byte) 0);

    /* renamed from: b */
    public final C0628xe f10383b;

    /* renamed from: c */
    public final C0507ss f10384c;

    /* renamed from: d */
    public final List f10385d;

    /* renamed from: e */
    public final Map f10386e;

    /* renamed from: f */
    public final C0602wf f10387f;

    /* renamed from: g */
    public final int f10388g = 4;

    /* renamed from: h */
    private agj f10389h;

    public C0500sl(Context context, C0628xe xeVar, C0507ss ssVar, Map map, List list, C0602wf wfVar) {
        super(context.getApplicationContext());
        this.f10383b = xeVar;
        this.f10384c = ssVar;
        this.f10385d = list;
        this.f10386e = map;
        this.f10387f = wfVar;
    }

    /* renamed from: a */
    public final synchronized agj mo5924a() {
        if (this.f10389h == null) {
            agj agj = new agj((byte) 0);
            agj.mo214i();
            this.f10389h = agj;
        }
        return this.f10389h;
    }
}

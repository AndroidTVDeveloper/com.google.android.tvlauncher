package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* renamed from: sl  reason: default package */
/* compiled from: PG */
public final class sl extends ContextWrapper {
    public static final sy a = new sy((byte) 0);
    public final xe b;
    public final ss c;
    public final List d;
    public final Map e;
    public final wf f;
    public final int g = 4;
    private agj h;

    public sl(Context context, xe xeVar, ss ssVar, Map map, List list, wf wfVar) {
        super(context.getApplicationContext());
        this.b = xeVar;
        this.c = ssVar;
        this.d = list;
        this.e = map;
        this.f = wfVar;
    }

    public final synchronized agj a() {
        if (this.h == null) {
            agj agj = new agj((byte) 0);
            agj.i();
            this.h = agj;
        }
        return this.h;
    }
}

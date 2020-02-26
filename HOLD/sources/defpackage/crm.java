package defpackage;

import android.widget.ImageView;

/* renamed from: crm  reason: default package */
/* compiled from: PG */
final class crm extends ctm {
    private final /* synthetic */ crz c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crm(crz crz, ImageView imageView) {
        super(imageView);
        this.c = crz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dcz dcz = (dcz) obj;
        if (dcz != null) {
            ((ImageView) this.a).setImageBitmap(dcz.b);
            this.c.t = dcz.a;
        } else {
            ((ImageView) this.a).setImageDrawable(null);
        }
        this.c.f();
    }
}

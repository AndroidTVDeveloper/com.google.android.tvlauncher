package p000;

import android.widget.ImageView;

/* renamed from: crm */
/* compiled from: PG */
final class crm extends ctm {

    /* renamed from: c */
    private final /* synthetic */ crz f7071c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crm(crz crz, ImageView imageView) {
        super(imageView);
        this.f7071c = crz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo246b(Object obj) {
        dcz dcz = (dcz) obj;
        if (dcz != null) {
            ((ImageView) this.f369a).setImageBitmap(dcz.f8317b);
            this.f7071c.f7151t = dcz.f8316a;
        } else {
            ((ImageView) this.f369a).setImageDrawable(null);
        }
        this.f7071c.mo3685f();
    }
}

package p000;

import android.graphics.Rect;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxw */
/* compiled from: PG */
final class cxw extends C0265jt {

    /* renamed from: e */
    public Rect f7890e;

    /* renamed from: f */
    public int f7891f;

    /* renamed from: g */
    public float f7892g;

    /* renamed from: h */
    public float f7893h;

    /* renamed from: i */
    public Rect f7894i;

    /* renamed from: j */
    public Rect f7895j;

    private cxw() {
    }

    public /* synthetic */ cxw(byte b) {
    }

    /* renamed from: a */
    public final C0265jt mo3742a(C0285km kmVar) {
        super.mo3742a(kmVar);
        this.f7890e = dei.m6235a(kmVar.f9783a);
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.f9783a;
        View view = notificationPanelItemView.f6625o;
        this.f7891f = view.getLeft();
        this.f7892g = view.getTranslationX();
        this.f7893h = view.getAlpha();
        this.f7894i = dei.m6235a(notificationPanelItemView.f6615e);
        this.f7895j = dei.m6235a(notificationPanelItemView.f6616f);
        return this;
    }

    public final String toString() {
        int i = this.f9700a;
        int i2 = this.f9701b;
        int i3 = this.f9702c;
        int i4 = this.f9703d;
        String valueOf = String.valueOf(this.f7890e);
        int i5 = this.f7891f;
        float f = this.f7892g;
        float f2 = this.f7893h;
        String valueOf2 = String.valueOf(this.f7894i);
        String valueOf3 = String.valueOf(this.f7895j);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 238 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("NotifItemHolderInfo left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        sb.append(", right=");
        sb.append(i3);
        sb.append(", bottom=");
        sb.append(i4);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append(", itemContainerLeft=");
        sb.append(i5);
        sb.append(", itemContainerTranslationX=");
        sb.append(f);
        sb.append(", itemContainerAlpha=");
        sb.append(f2);
        sb.append(", titleBounds=");
        sb.append(valueOf2);
        sb.append(", textBounds=");
        sb.append(valueOf3);
        return sb.toString();
    }
}

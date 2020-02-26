package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxw  reason: default package */
/* compiled from: PG */
final class cxw extends jt {
    public Rect e;
    public int f;
    public float g;
    public float h;
    public Rect i;
    public Rect j;

    private cxw() {
    }

    public /* synthetic */ cxw(byte b) {
    }

    public final jt a(km kmVar) {
        super.a(kmVar);
        this.e = dei.a(kmVar.a);
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.a;
        View view = notificationPanelItemView.o;
        this.f = view.getLeft();
        this.g = view.getTranslationX();
        this.h = view.getAlpha();
        this.i = dei.a(notificationPanelItemView.e);
        this.j = dei.a(notificationPanelItemView.f);
        return this;
    }

    public final String toString() {
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        String valueOf = String.valueOf(this.e);
        int i6 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        String valueOf2 = String.valueOf(this.i);
        String valueOf3 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 238 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("NotifItemHolderInfo left=");
        sb.append(i2);
        sb.append(", top=");
        sb.append(i3);
        sb.append(", right=");
        sb.append(i4);
        sb.append(", bottom=");
        sb.append(i5);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append(", itemContainerLeft=");
        sb.append(i6);
        sb.append(", itemContainerTranslationX=");
        sb.append(f2);
        sb.append(", itemContainerAlpha=");
        sb.append(f3);
        sb.append(", titleBounds=");
        sb.append(valueOf2);
        sb.append(", textBounds=");
        sb.append(valueOf3);
        return sb.toString();
    }
}

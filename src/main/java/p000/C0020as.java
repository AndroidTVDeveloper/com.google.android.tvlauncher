package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: as */
/* compiled from: PG */
public final class C0020as {

    /* renamed from: a */
    public final Notification.Builder f2153a;

    /* renamed from: b */
    public final C0018aq f2154b;

    /* renamed from: c */
    private final Bundle f2155c = new Bundle();

    public C0020as(C0018aq aqVar) {
        boolean z;
        new ArrayList();
        this.f2154b = aqVar;
        int i = Build.VERSION.SDK_INT;
        this.f2153a = new Notification.Builder(aqVar.f1757a, aqVar.f1767k);
        Notification notification = aqVar.f1768l;
        Notification.Builder deleteIntent = this.f2153a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(aqVar.f1760d).setContentText(aqVar.f1761e).setContentInfo(null).setContentIntent(aqVar.f1762f).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        deleteIntent.setFullScreenIntent(null, z).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        this.f2153a.setSubText(null).setUsesChronometer(false).setPriority(aqVar.f1763g);
        ArrayList arrayList = aqVar.f1758b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0194hc hcVar = (C0194hc) arrayList.get(i4);
            int i5 = Build.VERSION.SDK_INT;
            int i6 = Build.VERSION.SDK_INT;
            Notification.Action.Builder builder = new Notification.Action.Builder((Icon) null, (CharSequence) null, (PendingIntent) null);
            Bundle bundle = new Bundle((Bundle) null);
            bundle.putBoolean("android.support.allowGeneratedReplies", true);
            int i7 = Build.VERSION.SDK_INT;
            builder.setAllowGeneratedReplies(true);
            bundle.putInt("android.support.action.semanticAction", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(false);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", false);
            builder.addExtras(bundle);
            this.f2153a.addAction(builder.build());
        }
        Bundle bundle2 = aqVar.f1766j;
        if (bundle2 != null) {
            this.f2155c.putAll(bundle2);
        }
        int i8 = Build.VERSION.SDK_INT;
        int i9 = Build.VERSION.SDK_INT;
        this.f2153a.setShowWhen(true);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = Build.VERSION.SDK_INT;
        this.f2153a.setLocalOnly(aqVar.f1765i).setGroup(null).setGroupSummary(false).setSortKey(null);
        int i12 = Build.VERSION.SDK_INT;
        this.f2153a.setCategory(null).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = aqVar.f1769m;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            this.f2153a.addPerson((String) arrayList2.get(i13));
        }
        if (aqVar.f1759c.size() > 0) {
            Bundle bundle3 = aqVar.mo1244a().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle();
            for (int i14 = 0; i14 < aqVar.f1759c.size(); i14++) {
                String num = Integer.toString(i14);
                C0194hc hcVar2 = (C0194hc) aqVar.f1759c.get(i14);
                Bundle bundle5 = new Bundle();
                bundle5.putInt("icon", 0);
                bundle5.putCharSequence("title", null);
                bundle5.putParcelable("actionIntent", null);
                Bundle bundle6 = new Bundle((Bundle) null);
                bundle6.putBoolean("android.support.allowGeneratedReplies", true);
                bundle5.putBundle("extras", bundle6);
                bundle5.putParcelableArray("remoteInputs", null);
                bundle5.putBoolean("showsUserInterface", false);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(num, bundle5);
            }
            bundle3.putBundle("invisible_actions", bundle4);
            aqVar.mo1244a().putBundle("android.car.EXTENSIONS", bundle3);
            this.f2155c.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        this.f2153a.setExtras(aqVar.f1766j).setRemoteInputHistory(null);
        int i16 = Build.VERSION.SDK_INT;
        this.f2153a.setBadgeIconType(0).setShortcutId(null).setTimeoutAfter(0).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(aqVar.f1767k)) {
            this.f2153a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2153a.setAllowSystemGeneratedContextualActions(true);
            this.f2153a.setBubbleMetadata(null);
        }
    }
}

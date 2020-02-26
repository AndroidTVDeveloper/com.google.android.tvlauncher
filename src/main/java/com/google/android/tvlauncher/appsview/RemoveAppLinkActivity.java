package com.google.android.tvlauncher.appsview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class RemoveAppLinkActivity extends cfu {

    /* renamed from: a */
    public cfp f6412a;

    /* renamed from: c */
    private LinearLayout f6413c;

    /* renamed from: d */
    private TextView f6414d;

    /* renamed from: e */
    private ImageView f6415e;

    /* renamed from: f */
    private Button f6416f;

    /* renamed from: g */
    private Button f6417g;

    /* renamed from: h */
    private agj f6418h;

    public RemoveAppLinkActivity() {
        super("RemoveAppLinkActivity");
    }

    /* renamed from: a */
    public final void mo3240a() {
        setResult(0);
        finish();
    }

    public final void onBackPressed() {
        mo3240a();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6412a = this.f5439b;
        setContentView((int) R.layout.confirmation_dialog);
        this.f6413c = (LinearLayout) findViewById(R.id.dialog_view);
        this.f6414d = (TextView) findViewById(R.id.dialog_message);
        this.f6415e = (ImageView) findViewById(R.id.app_icon);
        this.f6416f = (Button) findViewById(R.id.allow_button);
        this.f6417g = (Button) findViewById(R.id.deny_button);
        ColorDrawable colorDrawable = new ColorDrawable(C0035bg.m3116b(this, R.color.app_banner_background_color));
        this.f6418h = new agj((byte) 0).mo195a(colorDrawable).mo205c(colorDrawable).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(getColor(R.color.app_banner_background_color), true));
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.format = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        m5272a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m5272a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
    }

    /* renamed from: a */
    private final void m5272a(Intent intent) {
        String callingPackage = getCallingPackage();
        if (callingPackage != null && dcy.m6192a(this, callingPackage) && intent.hasExtra("EXTRA_APP_LINK_ID") && !intent.getStringExtra("EXTRA_APP_LINK_ID").isEmpty()) {
            String stringExtra = intent.getStringExtra("EXTRA_APP_LINK_ID");
            dby a = cim.m4816a(this).mo2862a(stringExtra);
            if (a == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 29);
                sb.append("The app link with id ");
                sb.append(stringExtra);
                sb.append(" is null");
                Log.e("RemoveAppLinkActivity", sb.toString());
                mo3240a();
            } else if (!isFinishing() && !isDestroyed()) {
                this.f6416f.setText((int) R.string.remove);
                this.f6416f.setOnClickListener(new chz(this, a));
                this.f6417g.setOnClickListener(new cia(this, a));
                this.f6414d.setText(Html.fromHtml(getResources().getString(R.string.remove_app_link_msg, TextUtils.htmlEncode(a.f8183a)), 0));
                this.f6413c.setVisibility(0);
                this.f6416f.requestFocus();
                C0497si.m8292a((Activity) this).mo5945a(a.f8185c).mo202b(this.f6418h).mo5938a(this.f6415e);
            } else {
                Log.e("RemoveAppLinkActivity", "Activity is no longer running");
            }
        } else {
            Log.e("RemoveAppLinkActivity", "The metadata for uninstalling the app link is invalid");
            mo3240a();
        }
    }
}

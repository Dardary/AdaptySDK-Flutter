<h1 align="center" style="border-bottom: none">
<b>
    <a href="https://adapty.io/?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter">
        <img src="https://adapty-portal-media-production.s3.amazonaws.com/github/logo-adapty-new.svg">
    </a>
</b>
<br>Easy In-App Purchases Integration to
<br>Make Your Flutter App Profitable
</h1>

<p align="center">
<a href="https://go.adapty.io/subhub-community-flutter-rep"><img src="https://img.shields.io/badge/Adapty-discord-purple"></a>
<a href="https://github.com/adaptyteam/AdaptySDK-Flutter/blob/master/LICENSE"><img src="https://img.shields.io/badge/license-MIT-brightgreen.svg"></a>
</p>


<p align="center">
    <a href="https://adapty.io?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter"><b>Website</b></a> •
    <a href="https://go.adapty.io/subhub-community-flutter-repp"><b>Discord</b></a> •
    <a href="https://twitter.com/AdaptyTeam"><b>Twitter</b></a>
</p>

![Adapty: CRM for mobile apps with subscriptions](adapty-schema.png)

Adapty SDK is an open-source framework that makes implementing in-app subscriptions in Flutter fast and easy. It’s 100% open-source, native and lightweight.

## Why Adapty?

- [On-the-fly paywalls price testing](https://docs.adapty.io/docs/ab-test?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter). Test different prices, duration, offers, messages, and designs simultaneously, all without new app releases.
- [Full customer's payment history](https://docs.adapty.io/docs/profiles-crm?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter). Explore the user's payment events from the trial start to subscription cancellation or billing issues.
- [In-app purchase data integration](https://docs.adapty.io/docs/events?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter). Send subscription events to 3rd-party analytics, attribution, and ad services with no coding, even if the user uninstalls the app.
- [No server code implementation](https://docs.adapty.io/docs/flutter-sdk-configuration?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter). Integrate in-app purchases with server-side receipt validation in minutes. Apple Promotional Offers supported out-of-the-box.
- [Advanced analytics](https://docs.adapty.io/docs/analytics-charts?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-Flutter). Analyze your app real-time metrics with advanced filters, such as Ad network, Ad campaign, country, A/B test, etc.

<h3 align="center" style="border-bottom: none; margin-top: -15px; margin-bottom: -15px; font-size: 150%">
<a href="https://adapty.io/schedule-demo?utm_source=github&utm_medium=referral&utm_campaign=AdaptySDK-iOS_schedule-demo">Talk to Us to Learn More</a>
</h3>

## Integrate IAPs Within a Few Hours Without Server Coding 

**Adapty handles everything, from free trials to refunds, in a simple, developer-friendly SDK.**

- Free trials, upgrades, downgrades, crossgrades, family sharing, renewals, promo offers, intro offers, promo codes, and more – Adapty SDK does everything with a single line of code.
- Easy subscription management.
- One-time purchases and lifetime subscriptions supported.
- Sync subscribers' states across iOS, Android, and Web.


```swift
// Your app’s code
import Adapty

Adapty.activate("YOUR_APP_KEY")

// Make a purchase, Adapty handles the rest
Adapty.makePurchase(product: <product>, offerId: <offerid>) { (receipt, response, error) in
    if error == nil {
       // successful purchase
    }
}
```

## Price Testing for In-app Purchases on Flutter Without App Releases

- Optimize in-app subscriptions with the paywall A/B testing. Conversions, trials, revenue, cancellations, and more — everything is calculated for you: each paywall and each A/B test.
- Change images, colors, layouts, and literally anything with a custom JSON. Configure different prices, trial periods, promo offers, and more in Adapty without app releases.

## Paywall A/B Testing on iOS

![Adapty: In-app subscriptions with paywall A/B testing](https://adapty-portal-media-production.s3.amazonaws.com/github/ab-test-new.png)

- Conversions, trials, revenue, cancellations, and more  everything is calculated for you: each paywall and each A/B test.
- Change images, colors, layouts and literally anything with a custom JSON.
- Price testing is seamlessly integrated for any platform.

## Real-time Analytics for Your Flutter App

![Adapty: How Adapty works](https://adapty-portal-media-production.s3.amazonaws.com/github/analytics-new.gif)

- Manage the subscription's state without managing transactions.
- 99.5% accuracy with App Store Connect.
- View and analyze data by attributes, such as status, channels, campaigns, and more.
- Filter, group, and measure metrics by attribution, platform, custom users' segments, and more in a few clicks.

## Mobile App Monetization's Largest Community

Ask questions, participate in discussions about Adapty-related topics, become a part of our community for mobile app developers and marketers. Learn how to monetize your app, ask questions, post jobs, read industry news and analytics. Ad free.

<a href="https://discord.gg/subscriptions-hub"><img src="https://adapty-portal-media-production.s3.amazonaws.com/github/join-discord.svg" /></a>

## Contributing

- Feel free to open an issue, we check all of them or drop us an email at [support@adapty.io](mailto:support@adapty.io) and tell us everything you want.
- Want to suggest a feature? Just contact us or open an issue in the repo.

## Like Adapty SDK? 

So do we! Feel free to star the repo ⭐️⭐️⭐️ and make our developers happy!

## License

Adapty is available under the MIT license. [Click here](https://github.com/adaptyteam/AdaptySDK-Flutter/blob/master/LICENSE) for details.


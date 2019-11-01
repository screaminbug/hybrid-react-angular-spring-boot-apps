import { AppPage } from './app.po';

// @ts-ignore
describe('ng-app App', () => {
  let page: AppPage;

  // @ts-ignore
  beforeEach(() => {
    page = new AppPage();
  });

  // @ts-ignore
  it('should display welcome message', () => {
    page.navigateTo();
    // @ts-ignore
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});

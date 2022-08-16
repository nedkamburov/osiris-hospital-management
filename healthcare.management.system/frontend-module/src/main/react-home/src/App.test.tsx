import { render, screen } from '@testing-library/react';
import App from './App';

test('renders the React App header', () => {
  render(<App />);
  const appElement = screen.getByRole(/heading/i);
  expect(appElement).toBeInTheDocument();
});

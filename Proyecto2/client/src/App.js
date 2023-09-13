import logo from './logo.svg';
import './App.css';

//theme
import "primereact/resources/themes/lara-light-indigo/theme.css";     
//core
import "primereact/resources/primereact.min.css";                                               

import Home from './pages/home';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <Home/>
      </header>
    </div>
  );
}

export default App;
